package JavaBase.Day10;

public class StringExam {
  //같은 문자열이면 같은 메모리 공간 참조


  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";

    //new생성자로 생성하게 되면 항상 다른 메모리 공간 참조
    String str3 = new String("hello");
    String str4 = new String("hello");

    if (str1 == str2) {
      System.out.println("str1과 str2는 같은 레퍼런스입니다");
    }

    if (str1 == str3) {
      System.out.println("str1과 str3은 같은 레퍼런스입니다");
    }

    if (str3 == str4) {
      System.out.println("str3과 str4은 같은 레퍼런스입니다");
    }

    System.out.println(str1);
    System.out.println(str1.substring(3));
    System.out.println(str1);

  }
}
