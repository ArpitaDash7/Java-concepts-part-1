import java.io.*;
import java.util.*;
class Librarytest
{
	public static void main(String args[]) throws IOException
	{
		int reg,acc,number;
		long phone;
		String name,classes,ch5;
		Scanner sc= new Scanner(System.in);
		do{
		System.out.println("Enter the register Number of the student");
		reg=sc.nextInt();
		System.out.println("Enter the student name");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		name=reader.readLine();
		System.out.println("Enter the class of the student");
		classes=reader.readLine();
		System.out.println("Enter the phone number of the student");
		phone=sc.nextLong();
		System.out.println("Choose UG account(1) or PG account(2)");
		acc= sc.nextInt();
		Management m;
		switch(acc)
		{
			case 1:     System.out.println("UG LIBRARY");
				System.out.println("You can choose maximum of 10 books");
				System.out.println("Enter the number of books that you have entered");
				number=sc.nextInt();
				m= new UG(reg,classes,phone,name,number);
				m.Borrow();
				returnUG r= new returnUG(reg,classes,phone,name,number);
				r.display1();
			                break;
			case 2:     System.out.println("PG LIBRARY");
				System.out.println("You can choose maximum of 20 books");
				System.out.println("Enter the number of books that you have entered");
				number=sc.nextInt();
				m=new PG(reg,classes,phone,name,number);
				m.Borrow();
				returnPG p= new returnPG(reg,classes,phone,name,number);
				p.display2();
				break;

		}
	System.out.println("Do you wish to continue Y/n");
	ch5=reader.readLine();
	}while(ch5=="y" || ch5=="Y");
	}
}

abstract class Management
{
	int regno;
	long phone1;
	String name1,classes1;
	int no;
	Management(int regno, String classes1, long phone1, String name1,int no)
	{
		this.regno=regno;
		this.phone1=phone1;
		this.name1=name1;
		this.classes1=classes1;
		this.no=no;
	}
	abstract public void Borrow();
}

class UG extends Management
{
	UG(int regno, String classes1, long phone1, String name1,int no)
	{
		super(regno,classes1, phone1, name1,no);
	}
	
	public void Borrow()
	{
		int choice,date;
		Scanner sc= new Scanner(System.in);
		while(no>10)
		{
			System.out.println("Invalid. Exceeded the number of books");
			no=sc.nextInt();
		}
		System.out.println("Choose the theme of the books you want to choose");
		System.out.println("1.Fictional\n2.Life science\n3.Non-fictional\n4.Criminal\n5.Commerce\n6.Arts\n7.Informatics");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	System.out.println("You have chosen Fictional books");
			break;
		case 2:     System.out.println("You have chosen Life science books");
			break;
		case 3: 	System.out.println("You have chosen Non fictional books");
			break;
		case 4: 	System.out.println("You have chosen Criminal books");
			break;
		case 5: 	System.out.println("You have chosen Commerce books");
			break;
		case 6:	System.out.println("You have chosen Arts books");
			break;
		case 7:	System.out.println("You have chosen Informatics books");
			break;
		default:    System.out.println("Wrong choice");
			break;
		}
	}
}

class PG extends Management
{
	PG(int regno,  String classes1, long phone1, String name1,int no)
	{
		super(regno,classes1, phone1, name1,no);
	}
 
  	public void Borrow()
	{
		int choice;
		Scanner sc= new Scanner(System.in);
		while(no>20)
		{
			System.out.println("Invalid. Exceeded the number of books");
			no=sc.nextInt();
		}
		System.out.println("Choose the theme of the books you want to choose");
		System.out.println("1.Fictional\n2.Life science\n3.Non-fictional\n4.Criminal\n5.Commerce\n6.Arts\n7.Informatics");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	System.out.println("You have chosen Fictional books");
			break;
		case 2:     System.out.println("You have chosen Life science books");
			break;
		case 3: 	System.out.println("You have chosen Non fictional books");
			break;
		case 4: 	System.out.println("You have chosen Criminal books");
			break;
		case 5: 	System.out.println("You have chosen Commerce books");
			break;
		case 6:	System.out.println("You have chosen Arts books");
			break;
		default:    System.out.println("Wrong choice");
			break;
		}
	}
}

class returnUG extends UG
{	
  	static String college="Christ University";
	returnUG(int regno,  String classes1, long phone1, String name1,int no)
	{
		super(regno,classes1,phone1, name1,no);
	}
	void display1()
	{
		int days;
		double penalty;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of days it took for a student to return the books");
		days=sc.nextInt();
		System.out.println("Student Details at "+college);
		System.out.println("NAME:"+name1);
		System.out.println("REGISTER NUMBER:"+regno);
		System.out.println("PHONE NUMBER:"+phone1);
		System.out.println("CLASS:"+classes1);		
		if(days>15)
		{
			penalty=10.0* days;
			System.out.println("YOU WILL BE CHARGED RS."+penalty);
		}
		else 
		{
			System.out.println("YOU GET A BONUS OF 2 BOOKS MORE FOR YOUR NEXT BORROWING.");
		}
	}
}

class returnPG extends UG
{	
	static String college="Christ University";
	returnPG(int regno,  String classes1, long phone1, String name1,int no)
	{
		super(regno,classes1,phone1,name1,no);
	}
	void display2()
	{
		int days1;
		double penalty1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of days it took for a student to return the books");
		days1=sc.nextInt();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Student Details at"+college);
		System.out.println("Name:"+name1);
		System.out.println("Resgister name:"+regno);
		System.out.println("Phone number:"+phone1);
		System.out.println("Class:"+classes1);
		if(days1>15)
		{
			penalty1=10.0* days1;
			System.out.println("YOU WILL BE CHARGED RS."+penalty1);
		}
		else 
		{
			System.out.println("YOU GET A BONUS OF 2 BOOKS MORE FOR YOUR NEXT BORROWING.");
		}
		System.out.println("--------------------------------------------------------------------------");
	}
}



			
 
		
			