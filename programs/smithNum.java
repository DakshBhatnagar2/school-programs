import java.util.Scanner;
public class smithNum{
    int Digits = 0;
    int Prime = 1;
    int inpt;
    int temp;
    Scanner sc = new Scanner(System.in);
    void inpt() {
        System.out.println("Input a number: ");
        inpt = sc.nextInt();
    }
    void output() {
        temp= inpt;
        int n;
        while(temp > 0)  
        {      
            n = temp % 10;  
            Digits = Digits + n;  
            temp = temp / 10;  
        }
        for(int i = 2; i< inpt; i++) {
            while(inpt%i == 0) {
                Prime*=i;            
                inpt = inpt/i;
            }
        }
        if(Digits==Prime){
            System.out.println("It is a Smith Number");
        }
        else{
            System.out.println("It is not a Smith Number");
        }
    }
    void init() {
        inpt();
        output();        
    }
    static void main() {
        smithNum obj = new smithNum();
        obj.init();
    }
}