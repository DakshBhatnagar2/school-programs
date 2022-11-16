import java.util.Scanner;

public class Salary{
    int basic, da, hra, pf, gross, net;
    String emp_name;
    Scanner sc = new Scanner(System.in);
    
    void inpt() {
        System.out.println("Enter the Employee Name: ");
        emp_name = sc.nextLine();
        System.out.println("Enter the Basic Salary:");
        basic = sc.nextInt();
    }
    void output() {
        da = basic*(75/100);
        hra = basic*(25/100);
        pf = basic*(12/100);
        gross= da+hra+basic;
        net = gross+pf;
        
        System.out.println("Name of the Employee: "+ emp_name);
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
    }
    static void main() {
        Salary obj = new Salary();
        obj.inpt();
        obj.output();
    }
}