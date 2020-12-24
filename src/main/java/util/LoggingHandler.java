package util;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class LoggingHandler extends StreamHandler  {
  @Override
  public synchronized void publish(LogRecord record) {
    super.publish(record);
  }

  @Override
  public synchronized void flush() {
    super.flush();
  }

  @Override
  public synchronized void close() {
    super.close();
  }
}
