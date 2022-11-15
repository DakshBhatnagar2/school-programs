import java.util.Scanner;

public class bank_acc {
    Scanner sc = new Scanner(System.in);

    private String acc_name; // name of the account owner
    String acc_type; // type of account
    private String acc_no; // account number
    final int min_amt = 1000; // minimum amount
    int acc_balance; // account balance

    String acpt_name() {
        System.out.println("Enter the Account Holder's Name: ");
        acc_name = sc.nextLine(); // Get the account name from the user's input
        return acc_name;
    }
    String acpt_type() {
        int choice_temp;
        System.out.println("1. Current");
        System.out.println("2. Savings");

        choice_temp = sc.nextInt(); // Get the account type from the user's input'

        if (choice_temp == 1) {  
            acc_type = "Current";
        } else if (choice_temp == 2) {
            acc_type = "Savings";
        } else {
            System.out.println("Please select a valid choice.");
            acpt_type();
        }
        return acc_type;
    }
    String asgn_acc_no() {
        acc_no = "AC1521287N"; // Assign the account number
        return acc_no;
    }
    int asgn_balance() {
        acc_balance = min_amt; // Assign the account balance
        System.out.println("Account Created.");
        return acc_balance;
    }
    void disp_balance() {
        System.out.println("Available Balance: Rs." + acc_balance);
    }
    void init_acc() {
        asgn_acc_no();
        asgn_balance();
        disp_balance();
    }
    int deps_balance() {
        System.out.println("Enter the amount you want to deposit:");
        int deps_temp = sc.nextInt(); // Get the amount to deposit from the user
        acc_balance += deps_temp; // Add the amount to the account
        System.out.println("Transaction Successful    |    Rs." + deps_temp + " credited.    |    Current Balance Rs." + acc_balance);
        return acc_balance;
    }
    int wdr_balance() {
        System.out.println("Enter the amount you want to withdraw:");
        int wthdrw_temp = sc.nextInt(); // Get the account to withdraw from the user
        if (acc_balance - wthdrw_temp < min_amt) {
            System.out.println("Transaction Declined.");
        } else {
            acc_balance -= wthdrw_temp;
            System.out.println("Transaction Successful    |    Rs." + wthdrw_temp + " debited.    |    Current Balance Rs." + acc_balance);
        }
        return acc_balance;
    }
    void disp_details() {
        System.out.println("Beneficiary Name: " + acc_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Account Balance: Rs." + acc_balance);
    }
    void ui() {
        System.out.println("");
        System.out.println("Choose the Operation:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. View Details");
        System.out.println("4. Exit");
        System.out.println("");

        int choice = sc.nextInt(); // Get the choice from the user

        if (choice == 1) {
            if (acc_type.equals("Current")) {
                System.out.println("");
                System.out.print("Transaction Declined");
            } else if (acc_type.equals("Savings")) {
                System.out.println("");
                wdr_balance();
                
            }
        } else if (choice == 2) {
            System.out.println("");
            deps_balance();
            
        } else if (choice == 3) {
            System.out.println("");
            disp_details();
            
        } else if (choice == 4) {
            System.out.println("");
            System.out.println("Exited...");
            System.exit(0);
        } else {
            System.out.println("");
            System.out.println("Select a valid choice");
        
        }
        ui();
    }
    static void main() {
        bank_acc obj = new bank_acc(); // Create the object from bank_acc
        obj.acpt_name();
        obj.acpt_type();
        obj.init_acc();
        obj.ui();
    }
}
