import java.io.*;
import java.util.*;
class Stringmethods
{
	public static void main(String argss[]) throws IOException
	{
		String s,stwo;
		int n1,want;
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first String");
		s= reader.readLine();
		int n=s.length();
                                   System.out.println("Length of the given string  is "+n);
		System.out.println("-------------------------------------------------");
		do
		{
		System.out.println("Choose an option:-\n1.Reverse\n2.CompareTo\n3.charAt\n4.concat\n5.index and lastindex\n6.replace characters\n7.uppercase or lowercase\n8.Trim String");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1: reversemethod(s);
			            break;
			case 2: System.out.println("Enter the 2nd String pls");
			            stwo=reader.readLine();
			            n1=stwo.length();
                                                                 System.out.println("Length of the given string  is "+n1);
			            Stringcomparison(s, stwo);
			            break;
			case 3: Stringposition(s,n);
			            break;
			case 4: System.out.println("Enter the 2nd String pls");
			            stwo=reader.readLine();
			            n1=stwo.length();
                                                            System.out.println("Length of the given string  is "+n1);
			            concatString(s,stwo);
			            break;
			case 5: position(s);
			            break;
			case 6: replaceString(s);
			            break;
			case 7: System.out.println("Choose:\n1.Uppercase\n2.lowercase");
			            int ch6=sc.nextInt();
			            switch(ch6)
			            {
					case 1: System.out.println("You have chosen to convert the string into uppercase");
					            UppercaseString(s);
						break;
					case 2: System.out.println("You have chosen to convert the string into Lowercase");
					            LowercaseString(s);
						break;
					
		                             }
			           break;
			case 8:  
			             trimString(s);
			             break;
	                 }
		System.out.println("-------------------------------------------------");

		System.out.println("Do you want to continue 1 for yes?");
		want=sc.nextInt();
	}while(want==1);
		
}

public static void reversemethod(String s1) 
{
	String reverses = new StringBuffer(s1).reverse().toString();
	System.out.println(s1+" becomes " + reverses);	
}

public static void Stringcomparison(String s1, String s2)
{
	 if(s1.compareTo(s2)>0)
                 System.out.println(s1+" is lexographically greater than "+s2);
                 else if(s1.compareTo(s2)<0)
                 System.out.println(s2+" is lexographically greater than "+s1);
                 else
	 System.out.println(s2+" is equal to "+s1);
}

public static void Stringposition(String s1,int num)
{
	int choice,count=0;
	System.out.println("Enter the position of a character you want to find in a string");
	Scanner sc= new Scanner(System.in);
	int pos= sc.nextInt();
	while(pos>num-1)
	{
		System.out.println("Invalid entry of position.\nTry again!");
		pos=sc.nextInt();
	}
	char ch1=s1.charAt(pos);
	System.out.println("The character for the position "+pos+" is "+ch1);
	
	System.out.println("Do you wish to find the frquency of character using charAt? 1 for yes");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Which character you want to find the frequency of");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		char charac= sc.next().charAt(0);
		for(int i=0;i<=num-1;i++)
		{
			if(s1.charAt(i)==charac)
			{
				count++;
			}
		}
		System.out.println("Frequency is: "+count);
	}
		
}

public static void concatString(String s1, String s2)
{
	String concatenated= s1.concat(" ").concat(s2);
	System.out.println("The concatenated String is "+concatenated);
	System.out.println("Length of the concatenated String is "+concatenated.length());
	
}

public static void position(String s1)
{
		System.out.println("Which character you want to find the index of");
		Scanner sc= new Scanner(System.in);
		char charac1= sc.next().charAt(0);
		int pos1=s1.indexOf(charac1);
		System.out.println("The index of the character in the string is "+pos1);
		System.out.println("Do you want to continue with the same character? 1 for yes");
		int choice=sc.nextInt();
		if(choice!=1)
		{
			System.out.println("Enter the new character to find the last index of");
			charac1=sc.next().charAt(0);
		}	
		int pos2= s1.lastIndexOf(charac1);
		System.out.println("The last index of the character in the string is "+pos2);


}

public static void replaceString(String s1)
{
 	System.out.println("Which character you want to replace with?");
	Scanner sc= new Scanner(System.in);
	char charac2= sc.next().charAt(0);
	System.out.println("What is the character to be replaced?");
	char charac3= sc.next().charAt(0);
	System.out.println("The new string is "+s1.replace(charac3, charac2));
}

public static void UppercaseString(String s1)
{
		if(s1.equals(s1.toUpperCase()))
		{
			System.out.println("The string is already in uppercase format!");
		}
		else
		{
			System.out.println("The Uppercase String is "+s1.toUpperCase());
		}
}


public static void LowercaseString(String s1)
{
		if(s1.equals(s1.toLowerCase()))
		{
			System.out.println("The string is already in lowercase format!");
		}
		else
		{
			System.out.println("The Lowercase String is "+s1.toLowerCase());
		}
}

public static void trimString(String s1)
{
	BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	String trimmed= s1.trim();
	System.out.println("The original String is "+s1);	
 	System.out.println("The trimmed String is "+trimmed);	
	System.out.println("The length of the string is "+trimmed.length());	


}
}