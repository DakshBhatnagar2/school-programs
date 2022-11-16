import java.util.Scanner;

public class num_reverse {
    int inp, rev=0;
    int Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        inp = sc.nextInt();
        return inp;
    }
    int logic() {
        while(inp!=0){
            int rem = inp%10;
            rev = rev*10 +rem;
            inp = inp/10;
        } 
        System.out.println("The Reversed Number is "+rev);
        return rev;
    }
    static void main(){
        num_reverse obj = new num_reverse();
        obj.Input();
        obj.logic(); 
    }
}