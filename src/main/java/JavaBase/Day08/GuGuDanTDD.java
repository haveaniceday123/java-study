package JavaBase.Day08;

public class GuGuDanTDD {
  public int[] getDan(int number) {
    int[] array = new int[9];

    for (int i = 1; i < 10; i ++ ) {
      array[i - 1] = i * number;
    }

    return array;
  }
}
