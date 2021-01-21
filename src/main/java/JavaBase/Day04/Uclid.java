package JavaBase.Day04;

import java.util.Scanner;

public class Uclid {
  private long algorithm (long a, long b) {
    long remainder = a % b;

    if ( remainder == 0) {
      return b;
    } else {
      return algorithm(b, remainder);
    }
  }


  public static void main(String[] args) {
    long num1 = 0;
    long num2 = 0;
    int num3 = 0;
    int num4 = 0;

    Scanner scan = new Scanner(System.in);

      num1 = 500000000000000000L;
      num2 = 500000000000000002L;
      StringBuilder value1 = new StringBuilder();
      StringBuilder value2 = new StringBuilder();

      for (int i = 0; i < num1; i++) {
        value1.append("1");
      }
      System.out.println("here");

      for (int i = 0; i < num2 ;i++) {
      value2.append("1");
    }

      System.out.println(String.valueOf(value1));
      System.out.println(String.valueOf(value2));




      Uclid uclid = new Uclid();
      System.out.print(uclid.algorithm(Integer.parseInt(value1.toString()), Integer.parseInt(value2.toString())));

  }
}
