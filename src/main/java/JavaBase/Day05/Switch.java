package JavaBase.Day05;

public class Switch {
    public static void main(String[] args) {
        int value = 1;
        String str = "A";

        switch (str) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
            case "D":
                System.out.println("D");
            default:
                System.out.println("그 외 다른 숫자");
        }
    }
}
