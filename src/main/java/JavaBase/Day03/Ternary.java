package JavaBase.Day03;

import JavaBase.Loggging.Log;

import java.util.Calendar;
import java.util.logging.Logger;

public class Ternary {
  public static void main(String[] args) {
    int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    Logger log = Log.getLOG();
    String amp;

    amp = hour < 12 ? "오전" : "오후";
    String result = String.format("지금 시간은 %d 시이고 %s 입니다", hour, amp);
    log.info(result);

  }
}
