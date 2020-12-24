package myHttp;

import jdk.jshell.execution.Util;
import util.CustomLogFormatter;
import util.LogginFormatter;
import util.LoggingHandler;
import util.LoggingFilter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class Post {
  private final static Logger LOG = Logger.getGlobal();
  static Logger logger = Logger.getLogger("new");

  public static void main(String[] args) {
    Logger rootLogger = Logger.getLogger("");
    Handler[] handlers = rootLogger.getHandlers();
    if (handlers[0] instanceof ConsoleHandler) {
      rootLogger.removeHandler(handlers[0]);

      try {
        LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    //=============================================

//    LOG.setLevel(Level.ALL);

//    Handler handler = new ConsoleHandler();
//    LogginFormatter formatter = new LogginFormatter();
//    handler.setFormatter(formatter);
//    LOG.addHandler(handler);
//
//    LOG.severe("severe Log");
//    LOG.warning("warning Log");
//    LOG.info("info Log");



    logger.setLevel(Level.ALL);
    Handler log = new ConsoleHandler();

    log.setFormatter(new LogginFormatter());
    log.setLevel(Level.INFO);
    System.out.println(log.getLevel());

    logger.addHandler(log);
    logger.log(Level.WARNING, "Test");
    logger.severe("severe Log");
    logger.warning("warning Log");
    logger.info("info Log");
//
    System.out.println(logger.getLevel());


    log.setFormatter(new LogginFormatter());

    System.out.println(log.getLevel());
    System.out.println(log.getFormatter());
    logger.log(Level.WARNING, "HI");
    logger.addHandler(log);
    logger.info("HI2");



    logger.addHandler(new ConsoleHandler());
    logger.addHandler(new LoggingHandler());

    try {
      Handler fileHandler = new FileHandler("log/log", 1000, 5);
      fileHandler.setFormatter(new LogginFormatter());
      fileHandler.setFilter(new LoggingFilter());
      logger.addHandler(fileHandler);
      System.out.println(logger.getHandlers().toString());

      for (int i = 1; i <= 3; i ++ ) {
        logger.log(Level.INFO, "Msg" + i + "test");
      }
      System.out.println("=================================");
//      logger.log(Level.CONFIG, "Config data");

    } catch (SecurityException | IOException e) {
      e.printStackTrace();
    }
  }
}



