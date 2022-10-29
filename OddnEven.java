import java.io.*;
import java.util.*;
class OddnEven
{
    public static void main(String args[])
    {
        Odd t1= new Odd();
        Even t2= new Even();
        t1.start();
        t2.start();
    }
}

class Odd extends Thread
{
    public void run()
    {
            for(int i=1;i<30;i++)
            {
                if(i%2!=0)
                {
                    System.out.println("Odd number is "+i);
                }
	if(i==10)
	try
	{
	sleep(1000);
	}
	catch(Exception ex)
	{
	ex.printStackTrace(System.out);
	}

	}
}
}	
        
    

class Even extends Thread
{
     public void run()
    {
        try
        {
            for(int i=1;i<30;i++)
            {
                if(i%2==0)
                {
                    System.out.println("Even number is "+i);
                }
            }
        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}