package JavaBase.Day07;

import JavaBase.Day08.GuGuDanTDD;
import junit.framework.TestCase;
import org.junit.Assert;

public class GugudanTDDTest extends TestCase {
  GuGuDanTDD gt = new GuGuDanTDD();

  public static void main(String[] args) {
    junit.textui.TestRunner.run(GugudanTDDTest.class);
  }

  public void testDan() {
    int[] expected = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18};
    Assert.assertArrayEquals(expected, gt.getDan(2));
    expected = new int[] {3, 6, 9, 12, 15, 18, 21, 24, 27};
    Assert.assertArrayEquals(expected, gt.getDan(3));

  }


}
