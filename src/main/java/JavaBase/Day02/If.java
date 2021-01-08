package JavaBase.Day02;

import JavaBase.Loggging.Log;

import java.util.Random;
import java.util.logging.Logger;

public class If {
  static final Logger LOGS = Log.getLOG();

  public static void main(String[] args) {
    int x = new Random().nextInt(5) + 5;
    int y = new Random().nextInt(5);

    if ( x > y ) {
      String value = "x 는 y보다 작습니다";
      LOGS.info(value);
    }
  }
}
