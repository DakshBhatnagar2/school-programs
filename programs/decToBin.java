import java.util.Scanner;


public class decToBin {
   Scanner sc = new Scanner(System.in);
   int inpt;
   
   void otpt() {
      System.out.println("Enter the number you want to convert to binary:");  
      inpt = sc.nextInt();
      String bin = Integer.toBinaryString(inpt);
      System.out.println(bin);
      int i=Integer.parseInt(bin);  
   }
   static void main() {
      decToBin obj = new decToBin();
      obj.otpt();
    }
}