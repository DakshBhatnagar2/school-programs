import java.util.Scanner;

public class note_demn {
    Scanner sc = new Scanner(System.in);
    int amt;
    int uac = 0; //UAC stands for Unit of Currecy
    int note;
    int acpt_amt() {
        System.out.println("Enter the amount: ");
        amt = sc.nextInt();
        return amt;
    }
    void denominate(int note)
    {
        while(amt>= note)
        {
            if(amt<=note){
                break;
            }
            else{
                uac++;
                amt = amt-note;
            }
        }
        if(uac!=0){
            System.out.println(uac+ "x Rs. "+note+" Note");
        }
        uac = 0;
    }
    void run() {
        denominate(2000);
        denominate(500);
        denominate(200);
        denominate(100);
        denominate(50);
        denominate(20);
        denominate(10);
    }
    static void main(){
        note_demn obj = new note_demn();
        obj.acpt_amt();
        obj.run();
    }
}
