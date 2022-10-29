

class CreditDemo
{
	static int numAccountHolders=5;
	public static void main (String[] args)
	{
	Account account = new Account ();
	AccountHolder accountholders[] = new AccountHolder[numAccountHolders];
	for (int k= 0;k < numAccountHolders; k++ )
	{
	accountholders[k] = new AccountHolder(account);
	accountholders[k].start();
	}

	for(int i= 0;i<numAccountHolders;i++)
	{
	try
	{
		accountholders[i].join();
	}
	catch (Exception e)
	{
	}
	account.displayBalance();
	}
	}
}




class Account
{
	private int balance = 0; 

	synchronized void credit (int amount)
	{
	balance=balance+amount;
	} 

	void displayBalance()
	{
	System.out.println(balance);
	}
}

class AccountHolder extends Thread 
{
	Account account;
	AccountHolder(Account account)
	{
	this.account = account;
	}

	public void run ()
	{
	for(int i=0;i<5000;i++)
	account.credit(100);
	}
}

