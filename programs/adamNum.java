import  java.util.Scanner;

public class adamNum {
    Scanner sc = new Scanner(System.in);
    int inpt;
    
    int revNum(int num) {
        int rev = 0;
        while(num!=0){
            int rem = num%10;
            rev = rev*10 +rem;
            num = num/10;
        }
        return rev;
    }
    void inpt() {
        System.out.println("Enter a number: ");
        inpt = sc.nextInt();
    }
    void output() {
        int sq = inpt*inpt;
        int rev = revNum(inpt);
        int revSq= rev*rev;
        if(revNum(revSq)==sq) {
            System.out.println("It is an Adam Number");
        }
        else System.out.println("It is not an Adam Number");
    
    }
    static void main() {
        adamNum obj = new adamNum();
        obj.inpt();
        obj.output();
    }
}