import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class ATM{
    float balance;
    int PIN = 5674;
    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a valid pin");
        }
    }
        public void menu()
        {
            System.out.println("Enter your choice:");
            System.out.println("1.Check A/C Balance :");
            System.out.println("2.Withdraw Money:");
            System.out.println("3.Deposit Money:");
            System.out.println("4.Exit");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if(opt==1)
            {
                checkBalance();
            }
           else if(opt==2)
            {
                withdrawmoney();
            }
            else if(opt==3)
            {
                depositMoney();
            }
            else if(opt == 4)
            {
                return;
            }
            else{
                System.out.println("Enter a valid choice :");
            }

        }
          public void checkBalance()
          {
            System.out.println("Balance:"+ balance);
            menu();
          }
          public void withdrawmoney()
          {
            System.out.println("Enter amount to withdraw:");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount>balance)
            {
                System.out.println("Insufficient Balance :");
            }
            else{
                balance = balance-amount;
                System.out.println("MONEY WITHDRAWN SUCCESSFULL ");
            }
            menu();
            
          }
          public void depositMoney()
          {
            System.out.println("Enter the amount :");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            balance = balance + amount;
            System.out.println("Money deposited successfully");
            menu();

          }
    }



public class ATMMachine{
public static void main(String[] args) {
    ATM obj = new ATM();
    obj.checkpin();
}

}
