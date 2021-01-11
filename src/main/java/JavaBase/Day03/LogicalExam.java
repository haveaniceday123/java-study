package JavaBase.Day03;

import JavaBase.Loggging.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogicalExam {
  public boolean isAgeDiscountable(int age) {
    boolean isDiscount = false;

    if (age >= 60 || age <= 19) {
      isDiscount = true;
    }

    return isDiscount;
  }

  public static void main(String[] args) {
    Logger log = Log.getLOG();
    LogicalExam le = new LogicalExam();
    String resultString = "is Discount: {0}";

    log.log(Level.INFO, resultString, le.isAgeDiscountable(15));
    log.log(Level.INFO, resultString, le.isAgeDiscountable(27));
    log.log(Level.INFO, resultString,  le.isAgeDiscountable(61));

  }
}
