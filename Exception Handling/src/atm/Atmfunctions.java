package atm;
import java.util.Scanner;
public class Atmfunctions {
	static int Amount=-1;
	public static void withdrawl(int amount)
	{
		try{
		if(Amount>=amount)
		Amount=Amount-amount;
		System.out.println("The remaining Amount in Account is:"+Amount);
		}
		catch(ArithmeticException l)
		{
			System.out.println("Sorry!!Your Account does not have Suffecient Balance");
		}
	}
   public static void deposit(int amount){
	   Amount=Amount+amount;
   }
   public static void balanceCheck(){
	   System.out.println("Your current Balance is:"+Amount);
   }
	public static void main(String[] args) {
		int amount,choice;
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.printf("Enter choice:\n1:Deposit\n2:Withdrawl\n3:Balance Enquiry\n");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter amount to be deposited");
			amount=sc.nextInt();
			deposit(amount);
			break;
		case 2:
			System.out.println("Enter amount to be Withdrawn:");
			amount=sc.nextInt();
			withdrawl(amount);
			break;
		case 3:
			balanceCheck();
			break;
			default :
				System.out.println("Please Enter valid Details:-");
				break;
		}
		
	
		sc.close();

	}
	}

}
