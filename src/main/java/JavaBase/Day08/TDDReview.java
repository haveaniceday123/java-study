package JavaBase.Day08;

public class TDDReview {

  public int getYearDate(int year) {
    int dateSum = 0;
    for (int i = 1; i < year; i ++ ) {
      if (getIsLeapYear(i)) {
        dateSum += 366;
      } else {
        dateSum += 365;
      }
    }
    return dateSum;
  }

  public boolean getIsLeapYear(int year) {
    if (year % 400 == 0) return true;
    else if (year % 100 == 0) return false;
    else return (year % 4) == 0;
  }


  private final int[] monthDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public int getMonthDate(int month, boolean isLeap) {
    int dateSum = 0;
    for (int i = 0; i < month - 1; i++) {
      dateSum += monthDate[i];
    }

    if (isLeap && month > 2) {
      dateSum++;
    }
    return dateSum;
  }

  public int getTotalDate(String date) {
    int year = Integer.parseInt(date.substring(0, 4));
    int month = Integer.parseInt(date.substring(4, 6));
    int day = Integer.parseInt((date.substring(6, 8)));
    int dateSum = 0;

    dateSum += getYearDate(year) + getMonthDate(month, getIsLeapYear(year)) + day;
    return dateSum;
  }

  public int getSubTwoDate(String date1, String date2) {
    return Math.abs(getTotalDate(date1) - getTotalDate(date2));
  }
}
