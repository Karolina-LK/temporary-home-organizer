package tasks.jigsaw;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class UrlResolverImpl implements UrlResolver {

  private static final List<Predicate<String>> imagePredicates;

  static {
    imagePredicates = unmodifiableList(asList(
        imagePath -> imagePath.startsWith(HTTP_URI_PROTOCOL_SCHEMA),
        imagePath -> imagePath.startsWith(HTTPS_URI_PROTOCOL_SCHEMA),
        imagePath -> imagePath.contains(A_DOMAIN),
        imagePath -> imagePath.contains(B_DOMAIN)
    ));
  }

  @Override
  @Deprecated
  public String generateImageUrlFromContext(final String imagePath, Koutlet outlet, String protocol) {
    return generateImageUrlFromContext(imagePath, false, outlet, protocol);
  }

  @Override
  public String generateImageUrlFromContext(
      final String imagePath,
      final boolean isBRequest,
      final Koutlet outlet,
      final String protocol
  ) {
    if (null == imagePath || imagePath.trim().isEmpty()) {
      return imagePath;
    }

    final String expectedDomain = Optional.ofNullable(outlet)
        .map(o -> DEFAULT_IMAGE_A.equals(o.getImagesDomain()) && isBRequest ? B_IMAGE_DOMAIN : o.getImagesDomain())
        .orElse(isBRequest ? B_IMAGE_DOMAIN : DEFAULT_IMAGE_A);

    if (imagePredicates.stream().anyMatch(predicate -> predicate.test(imagePath))) {
      return this.modifyImagePath(imagePath, expectedDomain, protocol);
    }
    //plain access path without domain and protocol
    return protocol + "//" + expectedDomain + imagePath;
  }

  private String modifyImagePath(String imagePath, String expectedDomain, String protocol) {
    if (imagePath.contains(DEFAULT_IMAGE_A)) { //replaces any domain for the expected one
      imagePath = imagePath.replaceFirst("(\\w*\\.)+\\w+", expectedDomain);
    }

    if (!imagePath.startsWith(protocol)) { //replaces any protocol for the expected one
      imagePath = imagePath.replaceFirst("\\w+:", protocol);
    }
    return imagePath;
  }
}
