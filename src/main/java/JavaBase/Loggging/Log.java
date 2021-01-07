package JavaBase.Loggging;

import java.util.logging.Logger;

public class Log {
  private static final Logger _LOG = Logger.getGlobal();

  public static Logger getLOG() {
    return _LOG;
  }
}
