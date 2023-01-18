import java.util.Scanner;
class Account
{
	private int acctno;
	private int pswd;
	private double bal;
	Scanner sc=new Scanner(System.in);
	Account(int acctno,int pswd, double bal)
	{
		this.acctno=acctno;
		this.pswd=pswd;
		this.bal=bal;
	}

	public double getBalance()
	{
		System.out.println("enter the pswd");
		int pswd=sc.nextInt();
		if(pswd==this.pswd)
		{
			return bal;
		}
		else 
		{
		  System.out.println("enter correct pswd");
		   return 0.0 ;
		}
	}

	public void setDeposit()
	{
		System.out.println("enter money");
		double money=sc.nextDouble();
		bal=bal+money ;
	}

	public void setWitdraw()
	{
		System.out.println("enter the pswd");
		int pswd=sc.nextInt();
		if(pswd==this.pswd)
		{
			System.out.println("enter money");
			double money=sc.nextDouble();
			if(money<=bal)
			{
				bal=bal-money;
			}
	    	else 
	    	{
	    	  System.out.println("insufficient funds");
			}
		}
		else
		{
			System.out.println("incorrect pswd");
		}
	}
}
