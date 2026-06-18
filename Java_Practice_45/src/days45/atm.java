package days45;
import java.util.*;
abstract class atmTemplate{
	abstract void withdraw(int a);
	abstract void deposit(int a);
	abstract void balance();
}
class customer extends atmTemplate{
    private int balance;
    String AccNo;
    customer(int a,String b){
    	balance =a;
    	AccNo=b;
    } 
	void withdraw(int a) {
		balance = balance-a;
		System.out.println("The withdrawn amount is "+a+"\nThe remaining Balance is "+balance);
	}
	void deposit(int a) {
		balance = balance+a;
		System.out.println("The Deposited amount is "+a+"\nThe remaining Balance is "+balance);

	}
	void balance() {
		System.out.println("Account Number:"+AccNo);
		System.out.println("The Balance is "+balance);
	}
	
}
public class atm {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int balance=sc.nextInt();
    String name=sc.next();
    customer c=new customer(balance,name);
    c.withdraw(10);
    c.deposit(20);
    c.balance();
	}
}