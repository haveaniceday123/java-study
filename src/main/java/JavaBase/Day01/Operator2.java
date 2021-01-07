package JavaBase.Day01;

import JavaBase.Loggging.Log;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operator2 {

  public void calculate(int a, int b) {
    boolean c = a > b;
    boolean d = a == b;
    boolean e = a != b;

    Logger logger = Log.getLOG();

    logger.info(a + "은(는) " + b + " 와(과) 같습니까? " + d);
    logger.info(a + "은(는) " + b + " 와(과) 다릅니까? " + e);
  }

  public static void main(String[] args) {
    int a = new Random().nextInt(10);
    int b = new Random().nextInt(10);
    new Operator2().calculate(a, b);
  }

}
