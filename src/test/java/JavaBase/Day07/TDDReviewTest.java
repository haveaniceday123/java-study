package JavaBase.Day07;

import JavaBase.Day08.TDDReview;
import junit.framework.TestCase;
import org.junit.Test;

public class TDDReviewTest extends TestCase {
  TDDReview tr = new TDDReview();
  public static void main(String[] args) {
    junit.textui.TestRunner.run(TDDReviewTest.class);
//    new TDDReviewTest().getYearDateTest();

  }

  public void testGetIsLeapYear() {
    assertTrue(tr.getIsLeapYear(0));
    assertFalse(tr.getIsLeapYear(1));
    assertTrue(tr.getIsLeapYear(4));
    assertFalse(tr.getIsLeapYear(100));
    assertTrue(tr.getIsLeapYear(400));
  }

  public void testGetYearDate() {
    assertEquals(0, tr.getYearDate(1));
    assertEquals(365, tr.getYearDate(2));
    assertEquals(365 * 3, tr.getYearDate(4));
    assertEquals(365 * 4 + 1, tr.getYearDate(5));
  }

  public void testGetMonthDate() {
    assertEquals(31, tr.getMonthDate(2, true));
    assertEquals(31 + 29, tr.getMonthDate(3, true));
  }

  public void testGetTotalDate() {
    assertEquals(1, tr.getTotalDate("00010101"));
    assertEquals(366, tr.getTotalDate("00020101"));
  }

  public void testSubTwoDate() {
    assertEquals(1, tr.getSubTwoDate("20150716", "20150717"));
    assertEquals(31 + 28 + 30 + 31 + 30 + 31 + 14, tr.getSubTwoDate("20150101", "20150715"));
    assertEquals(31 + 29 + 30 + 31 + 14, tr.getSubTwoDate("20080101", "20080515"));
  }
}
