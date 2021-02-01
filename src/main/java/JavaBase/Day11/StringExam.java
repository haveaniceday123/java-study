package JavaBase.Day11;

public class StringExam {
  public static void main(String[] args) {
    String str1 = new String("hello world");
    String str2 = new String("hello world");

    if (str1 == str2) {
      System.out.println("str1과 str2는 같은 레퍼런스 입니다");
    } else {
      System.out.println("str1과 str2는 다른 레퍼런스 입니다.");
    }

    if (str1.equals(str2)) {
      System.out.println("str1과 str2는 같은 값을 가집니다.");
    } else {
      System.out.println("str1과 str2는 다른 값을 가집니다");
    }
  }
}

