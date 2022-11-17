import java.util.Scanner;
class BankAccount
{
    int accno;
    double balance;
    BankAccount(int accno, double balance)
    {
        this.accno = accno;
        this.balance = balance;
    }
    void withdraw(double w)
    {
        if(w>balance)
        {
            //throw new InvalidRequest
            System.out.println("Invalid request!");
        }
        else
        {
            balance = balance - w;
        }
    }
    void deposit(double d)
    {
        balance = balance + d;
    }
    void show()
    {
        System.out.println("Account Number: "+accno+"\nBalance: "+balance);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double d = input.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double w = input.nextInt();
        BankAccount a = new BankAccount(1001, 5000);
        a.withdraw(w);
        a.deposit(d);
        a.show();
    }
}
