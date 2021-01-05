package myHttp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Post {
  private static final Logger logger = LoggerFactory.getLogger(Post.class);

  public static void main(String[] args) {
    logger.trace("trace");
    logger.debug("debug");
    logger.info("info");
    logger.warn("warn");
    logger.error("error");
  }
}



