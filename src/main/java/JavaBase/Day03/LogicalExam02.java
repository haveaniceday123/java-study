package JavaBase.Day03;

import JavaBase.Loggging.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogicalExam02 {
  public boolean isAgeTwenties (int age) {
    boolean isTwenties = false;

    if (age >= 20 && age <= 29) {
      isTwenties = true;
    }

    return isTwenties;
  }

  public static void main(String[] args) {
    Logger log = Log.getLOG();
    String resultString = "is Twenties {0}";
    LogicalExam02 le = new LogicalExam02();

    log.log(Level.INFO, resultString, le.isAgeTwenties(19));
    log.log(Level.INFO, resultString, le.isAgeTwenties(25));
    log.log(Level.INFO, resultString, le.isAgeTwenties(30));
  }
}
