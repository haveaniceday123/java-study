package JavaBase.Day02;

import JavaBase.Loggging.Log;

import java.text.MessageFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operator3 {

  public static void main(String[] args) {
    Logger log = Log.getLOG();
    String value;

    int a = new Random().nextInt(10);
    int b = new Random().nextInt(10);
    int c = new Random().nextInt(10);

    value = String.format("%d", a - b * c);
    log.log(Level.INFO, value);

    value = String.format("%d", (a - b) * c);
    log.log(Level.INFO, value);

    value = String.format("a 가 5보다 크고, b도 5보다 큽니까? a=%d, b=%d, %b", a, b, a > 5 && b > 5);
    log.info(value);

    value = String.format("a 가 5보다 크거나, b도 5보다 큽니까? a=%d, b=%d, %b", a, b, a > 5 || b > 5);
    log.info(value);

    value = String.format("%d", ++a - 5);
    log.info(value);

    value = String.format("%d", a++ - 5 + 3);
    log.info(value);

    value = String.format("%d", a);
    log.info(value);

  }
}
