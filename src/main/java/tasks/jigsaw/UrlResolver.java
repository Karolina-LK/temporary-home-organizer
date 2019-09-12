package tasks.jigsaw;

public interface UrlResolver {

  String PERFORM_DOMAIN = "performgroup.com";
  String DAZN_DOMAIN = "daznservices.com";
  String DEFAULT_IMAGE_DOMAIN = "images.performgroup.com";
  String DAZN_IMAGE_DOMAIN = "images.daznservices.com";
  String HTTP_URI_PROTOCOL_SCHEMA = "http:";
  String HTTPS_URI_PROTOCOL_SCHEMA = "https:";

  String generateImageUrlFromContext(String imagePath, Koutlet outlet, String protocol);

  String generateImageUrlFromContext(String imagePath, boolean isDaznRequest, Koutlet outlet, String protocol);
}
