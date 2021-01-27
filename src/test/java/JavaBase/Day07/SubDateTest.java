package JavaBase.Day07;

import junit.framework.TestCase;

public class SubDateTest extends TestCase {
  public static void main(String[] args) {
    junit.textui.TestRunner.run(SubDateTest.class);
  }

  public void testGetYearDay() {
    assertEquals(0, SubDate.getYearDay(1));
    assertEquals(365, SubDate.getYearDay(2));
    assertEquals(365+365+365+366, SubDate.getYearDay(5));
  }

  public void testLeapYear() {
    assertTrue(SubDate.isLeapYear(0));
    assertFalse(SubDate.isLeapYear(1));
    assertTrue(SubDate.isLeapYear(4));
    assertTrue(SubDate.isLeapYear(1200));
    assertFalse(SubDate.isLeapYear(700));
  }

  public void testGetMonthDay() {
    assertEquals(31 + 28, SubDate.getMonthDay(3 , false));
    assertEquals(31 + 29, SubDate.getMonthDay(3, true));
  }

  public void testGetTotalDay() {
    assertEquals(1, SubDate.getTotalDay("00010101"));
    assertEquals(366, SubDate.getTotalDay("00020101"));
  }

  public void testSubDate() {
    assertEquals(1, SubDate.sub("20061231", "20070101"));
    assertEquals(31 + 28 + 30 + 31 + 14, SubDate.sub("20070101", "20070515"));
    assertEquals(31 + 29 + 30 + 31 + 14, SubDate.sub("20080101", "20080515"));

  }
}
