package JavaBase.Day07;

public class ArrayWithFor {
  public static void main(String[] args) {
    int[] iarray = new int[100];
    int sum = 0;
//    iarray[0] = 1;
//    iarray[1] = 2;

    for (int i = 0; i < iarray.length; i++) {
      iarray[i] = i + 1;
    }

    for (int i = 0; i < iarray.length; i++) {
      sum = sum + iarray[i];
    }

    System.out.println(sum);
  }
}
