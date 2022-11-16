import java.util.Scanner;
public class Tribonacci {
    Scanner sc = new Scanner(System.in);
    int a = 1, b =0, c = 1;
    int trib = a+b+c;
    int n;
    
    int Input() {
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        return n;
    }
    void Output() {
        System.out.println("0");
        System.out.println("1");
        for(int i = 0; i< 10; i++) {
            
            System.out.println(trib);
            a=b;
            b=c;
            c=trib;
            trib = a+b+c;
        }
    }
    static void main()  {
        Tribonacci obj = new Tribonacci();
        obj.Output();
    }
}