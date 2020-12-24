package util;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LoggingFilter implements Filter {

  @Override
  public boolean isLoggable(LogRecord record) {
    if (record.getLevel() == Level.CONFIG)
      return false;
    return true;
  }
}
