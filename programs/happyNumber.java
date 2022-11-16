import java.util.Scanner;

public class HappyNumber  
{     
    int inpt;
    Scanner sc = new Scanner(System.in);
       
    void output() {
        inpt = sc.nextInt();
        int temp = inpt;
        while(temp != 1 && temp != 4){  
            temp = isHappyNumber(temp);  
        }    
        if(temp == 1)  
            System.out.println(inpt + " is a happy number");  
        else
            System.out.println(inpt + " is not a happy number");    
    }
    int isHappyNumber(int temp){  
        int rem = 0; 
        int sum = 0;  
        while(temp > 0){  
            rem = temp%10;  
            sum = sum + (rem*rem);  
            temp = temp/10;  
        }  
        return sum;  
    }  
    static void main() {  
        HappyNumber obj = new HappyNumber();
        obj.output();
    }  
}  