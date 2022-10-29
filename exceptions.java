import java.io.*;
import java.util.*;
import java.lang.Exception.*;
class exceptions {
    public static void main (String[] args)throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int choice=0;
     do{
        	System.out.println("CHOOSE AN OPTION\n1.ARITHMETIC EXCEPTION \n2.NULL POINTER EXCEPTION\n3.NUMBER FORMAT EXCEPTION\n4.PHONE NUMBER VALIDATION\n5.PENSION VALIDATION\n6.AREA OF A SQUARE \nENTER YOUR CHOICE:");
	int c=Integer.parseInt(br.readLine());
	Myexception m=new Myexception();
	switch(c)
	{
		case 1:System.out.println("TO SEE THE ERROR ENTER THE SECOND NUMBER AS ZERO");
       			m.ame();
   			break;
		case 2:System.out.println("A STRING IS ASSIGNED NULL VALUE ");
 			m.npe(null);
 			System.out.println("ENTER A STRING ");
 			String s=br.readLine();
 			m.npe(s);
			 break;
		case 3:m.nfe();
			break;
		case 4:m.num();
			break;
		case 5:m.age();
			break;
		case 6:m.sq();
			break;
		default:System.out.println("invalid choice");
	}
	System.out.println("enter 1 to continue");
	choice=Integer.parseInt(br.readLine());
	}while(choice==1);
    }
    }
class Myexception extends Exception
{
	Myexception(){};
	Myexception(String message)
	{
	super(message);
	}

	void ame()throws IOException
	{
     		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER TWO NUMBERS :");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
      		try
	{
     		int c =a/b;
      		System.out.println(c);
      	}
      		catch(ArithmeticException e)
	{
      		System.out.println(e);
		System.out.println("\nARITHMETIC EXCEPTION CAUGHT ");
      	}
 	}
	void npe(String s)throws IOException
	{
		try
	{
		System.out.println("The length of the string is "+s.length());
	}
		catch(NullPointerException e)
	{
		System.out.println(e);
		System.out.println("\nNULL POINTER EXCEPTION CAUGHT ");
	}
	}
	void nfe()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
	{
		System.out.println("ENTER A STRING");
		int a=Integer.parseInt(br.readLine());
	}
		catch(NumberFormatException e)
	{
		System.out.println(e);
		System.out.println("\nSORRY FOR ASKING YOU TO ENTER A STRING JUST WANTED AN EXCEPTION");
		System.out.println("\nNUMBER FORMAT EXCEPTION CAUGHT ");
	}
	}
	void num()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER A PHONE NUMBER");
		String a=br.readLine();
		try
	{
		if(a.length()<10||a.length()>10)
		throw new Myexception("INVALID NUMBER OF DIGITS IN THE PHONE NUMBER");
		else
		System.out.println(a+" IS A VALID NUMBER");
	}
		catch(Myexception e)
	{
		System.out.println(e);
	}
		finally
	{
		System.out.println("\nA PHONE NUMBER HAS 10 DIGITS");
	}
	}
	void age()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER A AGE TO CHECK IF THEY ARE VALID TO RECIEVE PENSION");
		int a=Integer.parseInt(br.readLine());
		try
	{
		if(a<0||a<60)
		throw new Myexception("INVALID AGE TO RECIEVE PENSION");
		else
		System.out.println(" YOUR AGE IS VALID TO RECIEVE PENSION OF RUPPEES 5000 PER MONTH");
	}
		catch(Myexception e)
	{
		System.out.println(e);
	}
		finally
	{
		System.out.println("\n\nPENSION IS GIVEN ONLY TO SENIOR CITIZEN WHO HAS AGE GREATER THAN 60");
	}
	}
	void sq()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE SIDE OF THE SQUARE TO CALCULATE AREA");
		int a=Integer.parseInt(br.readLine());
		try
	{
		if(a<1)
		throw new Myexception("INVALID NUMBER AREA OF THE SQUARE CANNOT BE CALCULATED");
		else
		System.out.println("AREA OF THE SQUARE IS "+a+"*"+a+"="+(a*a));
	}
		catch(Myexception e)
	{
		System.out.println(e);
	}
		finally
	{
		System.out.println("\n\nFOR A SQUARE TO EXIST ITS SIDE HAS TO BE GREATER THAN 0");
	}
	}
	}