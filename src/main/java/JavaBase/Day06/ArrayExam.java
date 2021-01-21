package JavaBase.Day06;

public class ArrayExam {
  public int[] makeArray() {
    return new int[]{1, 2, 3, 4, 5};
  }

  public static void main(String[] args) {
    ArrayExam exam = new ArrayExam();
    int[] array = exam.makeArray();

    if (array.length == 5 &&
        array[0] == 1 &&
        array[1] == 2 &&
        array[2] == 3 &&
        array[3] == 4 &&
        array[4] == 5
    )
      System.out.println("정답입니다");
    else System.out.println("틀렸습니다");
  }
}
