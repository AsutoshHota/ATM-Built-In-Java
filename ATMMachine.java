import java.util.Scanner;

class ATM{

    float balance=0.0f;
    int pin=5674;

    public void checkPin(){
        System.out.println("Enter your PIN");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if(pin==enteredPin){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            checkPin();
        }

    }
    @SuppressWarnings("resource")
    public void menu(){
        System.out.println("Enter your choice :");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");

        Scanner sc= new Scanner(System.in);
        int opt=sc.nextInt();
        switch (opt) {
            case 1 -> checkBalance();
            case 2 -> withdrawMoney();
            case 3 -> depositMoney();
            case 4 -> exit();
            default -> System.out.println("Enter a valid choice");
        }

    }

    public void checkBalance() {
        System.out.println("Balance="+balance);
        menu();
    }

    @SuppressWarnings("resource")
    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw :");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient balance");
        }else{
            balance-=amount;
            System.out.println("Money withdeawn");
        }
        menu();
    }
    @SuppressWarnings("resource")
    public void depositMoney(){
        System.out.println("Enter the amount :");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
        balance+=amount;
        System.out.println("Money deposited successfully");
        menu();
    }


    public void exit(){
        System.out.println("Exit...");
    }
}

public class ATMMachine {

    public static void main(String[] args) {

        ATM obj= new ATM();
        obj.checkPin();
    }
    
}
