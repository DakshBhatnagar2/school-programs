import java.util.Scanner;

public class emirpNum {
    int inp, rev=0;
    boolean isPrime = true;
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        inp = sc.nextInt();
    }
    void output() {
       while(inp!=0){
            int rem = inp%10;
            rev = rev*10 +rem;
            inp = inp/10;
       } 
       for (int i = 2; i < inp; i++)
        {
            if((inp% i) == 0)
            {
                System.out.println("It is not an Emirp Number");
                System.exit(0);
            }
        }
       for(int i = 2; i<rev; i++) {
            if((rev%i)==0) {
                System.out.println("It is not an Emirp Number");
                System.exit(0);
            }
        }
        System.out.println("It is an Emirp Number");
    }
    static void main(){
        emirpNum obj = new emirpNum();
        obj.Input();
        obj.output();
    }
}