package JavaBase.Day07;

import junit.framework.TestCase;

public class SubDateTest extends TestCase {
  public static void main(String[] args) {
    junit.textui.TestRunner.run(SubDateTest.class);
  }

  public void testGetYearDay() {
    assertEquals(0, SubDate.getYearDay(1));
    assertEquals(365, SubDate.getYearDay(2));
//    assertEquals(365+365+365+365, SubDate.getYearDay(5));
  }

  public void testLeapYear() {

  }
}
