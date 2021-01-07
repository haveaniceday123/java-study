package JavaBase.Day01;

public class Operator {

  public void calculate() {
    int a = 7;
    int b = 3;
    int c =  a + b;
    int d = a - b;
    int e = a * b;
    int f =  a % b;

    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
  }

  public static void main(String[] args) {
    new Operator().calculate();
  }

}
