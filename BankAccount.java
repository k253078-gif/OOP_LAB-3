package Task1;

public class BankAccount {
    //Instance variables
    int AccountNumber;
    String Name;
    double Balance;

    //Default Constructor
    BankAccount(int number, String name){
        this.AccountNumber=number;
        this.Name=name;

    }

    BankAccount(int number, String name , double balance){
        this.AccountNumber=number;
        this.Name=name;
        this.Balance=balance;
    }

    void display(){
        System.out.println("Account Number: " +AccountNumber );
        System.out.println("Account Holder Name: " +Name );
        System.out.println("Account Balance: " + Balance );
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount(446236 , "WASI" );
        BankAccount b2 = new BankAccount(123526, "WASI", 376.34);
        b1.display();
        b2.display();

    }
}
