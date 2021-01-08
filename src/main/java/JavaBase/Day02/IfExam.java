package JavaBase.Day02;

import JavaBase.Loggging.Log;

import java.util.logging.Logger;

public class IfExam {
  private static final Logger LOGS = Log.getLOG();

  public static void main(String[] args) {
    int value = 5;

    if (value % 3 == 0) {
      String format = String.format("%d 는(은) 3의 배수입니다.", value);
      LOGS.info(format);
    }
  }
}
