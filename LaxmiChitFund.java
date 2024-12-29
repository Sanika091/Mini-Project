import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unused")

public class LaxmiChitFund {
    static Scanner sc = new Scanner(System.in);
	static String user;
	static String user1;
    static Long phone ;
	static float score;
    static String add;
    static String type;
	static int pin;
	static double bal;
	static ArrayList<String> tran = new ArrayList<>();
	public static void main(String[] args) 
	{
		for (; ; )
		{
		   System.out.println();
		   System.out.println(" *****  WELCOME  *****");
		   System.out.println("    LAXMI CHIT FUND ");
		   System.out.println();
		   System.out.println(" 1. New Account ");
		   System.out.println(" 2. Login ");
		   System.out.println();
		   System.out.println("Enter an option : ");
		   int option = sc.nextInt();
		   
		   switch(option)
			{
				case 1 -> newAccount();
				case 2 -> loginUser();
				default -> System.out.println(" Wrong option entered ");
			}
		}
	}
	  public static void newAccount() 
	{
		  if(user!=null)
		{
			System.out.println();
			System.out.println("Account is already created login ");
			return;
		}
		System.out.println();
		System.out.println("Account Creation");
		System.out.print("Username : ");
		sc.nextLine();
		user = sc.nextLine();
		System.out.print("Phone Number : ");
		phone = sc.nextLong();
		System.out.print("Address : ");
		sc.nextLine();
		add = sc.nextLine();
		System.out.println("Pin : ");
		pin = sc.nextInt();
		System.out.println("Account type : ");
		type = sc.next();
		System.out.println("Amount to be deposited : ");
		bal = sc.nextDouble();
		tran.add("Credited : "+bal);
		System.out.println();
		System.out.println("Account Created ");
	}
	public static void loginUser()
	{
		if(user!=null)
		{
			System.out.println();
			System.out.println("Login ");
			System.out.println("Username : ");
			sc.nextLine();
			String user1 = sc.nextLine();
			System.out.println("Pin : ");
			int pin1 = sc.nextInt();
			if(user1.equals(user) && pin==pin1)
			{
				features();
			
			}else{
				System.out.println();
				System.out.println("Wrong Credencial");
				System.out.println();
			}
			  }
			  else{
				System.out.println("CREATE YOUR ACCOUNT FIRST");
				
			  }
		   }
		public static void features()
			{
			    for (; ; )
			    {
			    
			
			System.out.println();
			System.out.println("Features ");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Debit Amount ");
			System.out.println("3. Check Balance ");
			System.out.println("4. Transfer Amount ");
			System.out.println("5. Statement ");
			System.out.println("6. Edit Account ");
			System.out.println("7. Loan & more ");
			System.out.println("8. Logout ");
			System.out.println();
			int option = sc.nextInt();
			switch(option)
            {
				case 1:depositeAmount();break;
				case 2:debitAmount();break;
				case 3:checkBalance();break;
				case 4:transferAmount();break;
				case 5:statement();break;
				case 6:editAccount();break;
				case 7:loan();break;
				case 8:System.exit(0);
				default:System.out.println("Wrong option ");
            }	
			  System.out.println(); 
			
		}
		   
	}
	  public static void statement()
	      {
		  System.out.println();
		  System.out.println("Statement");
		  System.out.println();
		  for(String i:tran){
			  System.out.println(i);
		  }
		  System.out.println();
		}
		

	public static void checkBalance()
		{
		  System.out.println("Check balance");
		  System.out.println();
		  System.out.println("Enter  Your Pin:");
		  int pin1=sc.nextInt();
		  if(pin==pin1)
			{
			  System.out.println();
			  System.out.println("Your Account Balance is : "+ bal+ "Rs");
			}
			else{
				System.out.println();
				System.out.println("Wrong Pin entered");
			}
		}
		
		
	public static void depositeAmount()
		{
		    System.out.println();
		    System.out.println(" Deposite Amount:");
		    System.out.println();
		    System.out.println("Enter an amount: ");
		    double deposite=sc.nextDouble();
		    bal=bal+deposite;
		    tran.add("credited:"+ deposite);
		    System.out.println();
		    System.out.println("Amount Deposited" );
	     }
				

		
	public static void debitAmount()
		{
		   System.out.println(" ");
		   System.out.println("Debit Amount");
		   System.out.println();
		   System.out.println("Enter an amount:");
		   double debit=sc.nextDouble();
		   System.out.println("Enter Your Pin :");
		   int pin1=sc.nextInt();
		
		   if(pin==pin1)
			{
			  if(debit<=bal)
				{
		           bal=bal-debit;
		           tran.add("Debited:"+ debit);
		           System.out.println("Amount Debited" );
				}else{
					System.out.println();
					System.out.println("Insufficient Funds");
				}
			}
				else{
					System.out.println();
					System.out.println("Wrong Pin entered.");
	                }
			}
	public static void transferAmount()
		{
		       System.out.println("check the balance");
		       System.out.println();
			   System.out.println("enter a account number : ");
			   @SuppressWarnings("unused")
            double acc_no = sc.nextDouble();
			   System.out.println("enter a amount to be transfered : ");
			   double transfer = sc.nextDouble();
			   System.out.println("enter your pin : ");
			   int pin1=sc.nextInt();
		        if(pin==pin1)
			   {
				 if(bal>=transfer){
					bal=bal-transfer;
					tran.add("credited"+transfer);
					System.out.println("Transfer a "+ transfer + "Amount");
				 }
				 }else{
					System.out.println();
					System.out.println("wrong pin entered");
				   }
				}
		
		
	 
    @SuppressWarnings("StringEquality")
	public static void editAccount()
		{
				
				if(user==user1){
					System.out.println();
			        System.out.println("update the account user information ");
			        return;
				}
				  System.out.println();
		          System.out.println("Account Creation");
		          System.out.print("Username : ");
		          sc.nextLine();
		          user1 = sc.nextLine();
		          System.out.print("Phone Number : ");
		          phone = sc.nextLong();
		          System.out.print("Address : ");
		          sc.nextLine();
		          add = sc.nextLine();
		          System.out.println("Pin : ");
		          pin = sc.nextInt();
				
		  }
   
	public static void loan()
          {
			  if(score>=50)
			  {
				System.out.println("you are eligible for the loan : ");
				
			  }else{
				 System.out.println("you are not eligible for the loan");
				
			  }
				   System.out.println();
		           System.out.println("types 0 f loan : ");
		           System.out.println("1.Home loan");
		           System.out.println("2.car loan");
		           
		           System.out.println();
				   int option1=sc.nextInt();
				   
				   switch (option1)
				{
					case 1 -> homeLoan();
					case 2 -> carLoan();
					    
			    }
				    System.out.println();
               
          }
    public static void homeLoan()
          {
	         System.out.println("Enter your Loan amount : ");
			 double amount1 = sc.nextDouble();
			 for(int i=0;i<=3;i++)
			  {
				double Payment = ((amount1*10)/100);
				double rem = (amount1 - Payment);
				System.out.println(Payment);
				System.out.println(rem);
				
			  }
		 }
	public static void carLoan()
	{
		     System.out.println("Enter your Loan amount : ");
			 double amount2=sc.nextDouble();
			 for(int i=0;i<=3;i++)
			  {
				double Payment1 = ((amount2*10)/100);
				double rem1 = (amount2 - Payment1);
				System.out.println(Payment1);
				System.out.println(rem1);
				
			  }
		
	}
}
