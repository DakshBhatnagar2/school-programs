import java.util.Scanner;

public class binAdd {
    Scanner sc = new Scanner(System.in);
    
    String bin1;
    String bin2;
    int sum;

    void takeInpt() {
        System.out.println("Enter the first Binary Number:");
        bin1 = sc.next();
        System.out.println("Enter  the second Binary Number:");
        bin2 = sc.next();
    }
    void oprt() {
        // Use as radix 2 because it's binary    
        int number0 = Integer.parseInt(bin1, 2);
        int number1 = Integer.parseInt(bin2, 2);

        int sum = number0 + number1;
        System.out.println(Integer.toBinaryString(sum));
    }
    public static void main() {
        binAdd obj = new binAdd();
        obj.takeInpt();
        obj.oprt();
    }
}