import java.util.Scanner;

class Bankaccount{
    double amt;
    void Banckaccount(double amount){
        this.amt=amount;
    }
    public void withdraw(double amount){
        if(amt>=amount){
            amt=amt-amount;
            System.out.println("Withdraw:"+amt);
        }
        else{
            System.out.println("Insufficient balance you can not withdraw money!!!");
        }
    }
    public void deposite(double amount){
        amt=amt+amount;
        System.out.println("Deposite:"+amt);
    }
    public void bankbalance(){
        System.out.println("Your Bank Balance is"+amt);
    }
}
public class atminterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bankaccount ba=new Bankaccount();
        while (true) {
        System.out.println("1.Withdraw money");
        System.out.println("2.Deposite money");
        System.out.println("3.Dispaly bank balance");
        System.out.println("Enter your choice ");
        int choice=sc.nextInt();
           switch (choice) {
            case 1:
                System.out.println("Enter the money you want to withdraw:");
                double wit=sc.nextDouble();
                ba.withdraw(wit);
                break;
           
            case 2:
                System.out.println("Enter the money you want to deposite:");
                double dep=sc.nextDouble();
                ba.deposite(dep);
                break;
            case 3:
                ba.bankbalance();
                break;
            default:
                System.out.println("Enter valid Choice!!");     
        } 
    }
    }
}
