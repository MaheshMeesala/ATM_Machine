import java.util.Scanner;
class Atm {
    
    int accountbalance = 1000;
    
    public void checkBalance() {
        System.out.println("Current balance = " + accountbalance);
    }

    public void deposit(int money_depositing) {
        if(money_depositing>0){
        accountbalance=accountbalance+money_depositing;
        System.out.println("Deposit of " + money_depositing + " is successful.");
    }
    else{
        System.out.println("The amount you have entered is Ivalid.Please enter valid amount to deposit:");
        Scanner scan=new Scanner(System.in);
        int addamount=scan.nextInt();
        accountbalance=accountbalance+addamount;
         System.out.println("Deposit of " + addamount + " is successful.");
         
    }
    }

    public void withdraw(int money_withdrawing) {
        if (accountbalance >= money_withdrawing) {
            accountbalance=accountbalance-money_withdrawing;
            System.out.println("Withdrawal of " + money_withdrawing + " is successful.");
        } else {
            System.out.println("Insufficient funds in your account.");
        }
    }
}

public class ATM_Machine {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Atm atm = new Atm();
        int choice; 

        do {
            System.out.println("===ATM Dashboard===");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scan.nextInt(); 
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = scan.nextInt();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = scan.nextInt();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 4);
    }
}