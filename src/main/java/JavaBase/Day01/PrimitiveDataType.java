package JavaBase.Day01;

public class PrimitiveDataType {
  public static void main(String[] args) {
    int intValue = 200;
    // 암시적 형변환
    long longValue = intValue;
    System.out.println(longValue);

    // 명시적 형변환
    long longValue2 = 20;
    int intValue2 = (int) longValue2;
    System.out.println(intValue2);

  }
}
