package JavaBase.Day02;

import JavaBase.Loggging.Log;

import java.util.Random;
import java.util.logging.Logger;

public class IfExam2 {
  static final Logger LOGS = Log.getLOG();

  private int lfText(int value) {
    int ret = 0;

    if (value % 3 == 0) {
      ret = 3;
    } else if (value % 4 == 0) {
      ret = 4;
    }
    return ret;
  }

  public static void main(String[] args) {
    int value = new Random().nextInt(100);

    int result = new IfExam2().lfText(value);
    String format = String.format("%d, %d", result, value);
    LOGS.info(format);
  }
}
