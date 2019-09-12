package tasks.jigsaw;

public interface UrlResolver {

  String A_DOMAIN = "a.com";
  String B_DOMAIN = "b.com";
  String DEFAULT_IMAGE_A = "images.a.com";
  String B_IMAGE_DOMAIN = "images.b.com";
  String HTTP_URI_PROTOCOL_SCHEMA = "http:";
  String HTTPS_URI_PROTOCOL_SCHEMA = "https:";

  String generateImageUrlFromContext(String imagePath, Koutlet outlet, String protocol);

  String generateImageUrlFromContext(String imagePath, boolean isBRequest, Koutlet outlet, String protocol);
}
