import java.util.Scanner;
public class fibonacci {
    
    Scanner sc = new Scanner(System.in);
    int terms;
    
    int Input() {
        System.out.println("Enter the number of terms");
        terms = sc.nextInt();
        return terms;
    }
    
    void output(){
         int n1=0,n2=1,n3;
        System.out.println("0");
        for(int i=0;i<terms-1;++i)  
         {    
          n3=n1+n2;    
          System.out.println(n3);    
          n1=n2;    
          n2=n3;    
         }    
    }
    static void main()  {
        fibonacci obj = new fibonacci();
        obj.Input();
        obj.output();
    }
}