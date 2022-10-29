import java.util.*;
import java.io.*;
import java.lang.Math;
import abc.Display;
class InterfaceDemo1
{
    public static void main(String args[]) throws IOException
    { 
              int c1, ch,ch5;
              int register;
              java.util.Date date = new java.util.Date();    
              System.out.println(date);      
              System.out.println("*-*-*-*-*-*-*-*-*-*Welcome to program*-*-*-*-*-*-*-*-*-*-*-*-*");
              System.out.println("*-*-*-*Program to demonstrate use of interface in java-*-*-*");
              Scanner sc=new Scanner(System.in);
              char choice;
              do
              { 
              System.out.println("\n\n*-*-*-*-*-*-*-Enter the information of patient*-*-*-*-*-*-*-*");
              System.out.println("Enter the name of patient");
              String n1=sc.nextLine();
              System.out.println("Please share patient Phone number");
              String phone=sc.nextLine();
              while(phone.length()!=10)
              {
	          System.out.println("INVALID PHONE NUMBER!\nENTER A 10 DIGIT VALID PHONE NUMBER : ");
	          phone=sc.nextLine();
              } 
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Please Choose patient Gender M/F ");
              char gen = sc.next().charAt(0);
              System.out.println("Have you registered? 1 for yes/ 0 for no");
              ch=sc.nextInt();
              if(ch==1)
              {
               System.out.println("You are already a member! Welcome to Apollo Hospital");
               System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
               c1=0;
              }
              else
              {
                  System.out.println("You have to deposit Rs.400 for registration! Welcome to Apollo Hospital");
                  System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                  c1=400;
              }
                Structure1 v1;
	Structure2 v2;
	Display d=new Display(n1,gen,phone,c1);
           
              System.out.println("Please choose the corresponding speciality to book an appointment.");
               System.out.println("1.Dermatology\n2.Internal Medicine\n3.Padiatrics");
               int choice2= sc.nextInt();
               switch(choice2)
               {
                  case 1:  	v1= new Dermatology(n1,gen,phone,c1);
             		v2= new Dermatology(n1,gen,phone,c1);
		d.display();
             		v2.salary();
		v1.appointment();
		break;
                  case 2: v1= new Internal(n1,gen,phone,c1);
             		v2= new Internal(n1,gen,phone,c1);
		d.display();
             		v2.salary();
		v1.appointment();
                             break;
                  case 3: 	v1= new Paediatrics(n1,gen,phone,c1);
             		v2= new Paediatrics(n1,gen,phone,c1);
		d.display();
             		v2.salary();
		v1.appointment();
                              break;
                  default: v1= new nofield(n1,gen,phone,c1);
		d.display();
		v1.appointment();
                                break;

              }
             System.out.println("DO YOU WANT TO CONTINUE. Y/N");
             ch5=sc.next().charAt(0);
             }while(ch5=='Y' || ch5=='y');

        }
    }
    
interface Structure1
{
   void appointment();
}

interface Structure2
{
    void salary();
}



class Dermatology extends Display implements Structure1, Structure2
{

Dermatology(String name, char gender, String phono, int cost)
{
	super(name, gender, phono, cost);

}    
    
    public void salary()
    {
        double tcost, tt;
        int choice3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please choose the corresponding Doctor ID to book an appointment");
        System.out.println("1.Dr. Shantanu\n2.Dr Nikhil");
        choice3=sc.nextInt();
        switch(choice3)
        {
        case 1:System.out.println("Doctor: Dr. Shantanu");
         tcost= 500+ Math.floor(Math.random()*1000);
         System.out.println("Doctor's fees:"+tcost);
         tt= c+tcost;
         System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
         System.out.println("Kindly pay Rs."+tt+" to book an appointment");
         break;

        case 2:System.out.println("Doctor: Dr Nikhil");
        tcost= 500+ Math.floor(Math.random() * 1000);
        System.out.println("Doctor's fees:"+tcost);
        tt= c+tcost;
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Kindly pay Rs."+tt+" to book an appointment");
        break;
         }
        }
    public void appointment()
	{
	    int register;
	System.out.println("If for any reason you want to cancel your appointment");
                System.out.println("Reply 1 to confirm the appointment\nReply 2 to cancel to appointment");
                Scanner sc= new Scanner(System.in);
                int choice4= sc.nextInt();
                switch(choice4)
                {
                case 1: register= 10000+ (int)(Math.floor(Math.random()*50000));
                        System.out.println("Your appointment has been booked. Your appointment number is "+register);
                        System.out.println("-*-*-*-*-*-*_THANK YOU -*-*-*-*-*-*-*");
                        break;

                case 2:System.out.println("Note: You will be refunded the Doctor's fees only. ");
                           System.out.println("-*-*-*-*-*-*_THANK YOU -*-*-*-*-*-*-*");
	           break;
        
                }
}
}

class Internal extends Display implements Structure1, Structure2
{

Internal(String name, char gender, String phono, int cost)
{
	super(name, gender, phono, cost);

}

	   public void salary()
 		  {
  			  double tcost, tt;
    			  int choice3;
   			  Scanner sc= new Scanner(System.in);
    			 System.out.println("Please choose the corresponding Doctor ID to book an appointment");
    			 System.out.println("1.Dr. Ankit \n2.Dr Ashok Kumar");
     			choice3=sc.nextInt();
     			switch(choice3)
        			  {
        			  case 1:System.out.println("Doctor: Dr Ankit"); 
                   		  tcost=500+Math.floor(Math.random() *1000);
                    		  System.out.println("Doctor's fees:"+tcost);
                     		 tt= c+tcost;
                     		 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                      		 System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                    		  break;
	
             			  case 2:System.out.println("Doctor: Dr Ashok Kumar");
                     		 tcost= 500+ Math.floor(Math.random() * 1000);
                     		 System.out.println("Doctor's fees:"+tcost);
                     		 tt= c+tcost;
                     		 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                     		 System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                     		 break;
             			   }
		}
	    public void appointment()
	{
	    int register;
	System.out.println("If for any reason you want to cancel your appointment");
                System.out.println("Reply 1 to confirm the appointment\nReply 2 to cancel to appointment");
                Scanner sc= new Scanner(System.in);
                int choice4= sc.nextInt();
                switch(choice4)
                {
                case 1: register= 10000+ (int)(Math.floor(Math.random()*50000));
                        System.out.println("Your appointment has been booked. Your appointment number is "+register);
                        System.out.println("-*-*-*-*-*-*_THANK YOU -*-*-*-*-*-*-*");
                        break;

                case 2:System.out.println("Note: You will be refunded the Doctor's fees only. ");
                           System.out.println("-*-*-*-*-*-*_THANK YOU -*-*-*-*-*-*-*");
	           break;
        
                }
}

}

class  Paediatrics extends Display implements Structure1, Structure2
{

Paediatrics(String name, char gender, String phono, int cost)
{
	super(name, gender, phono, cost);

}
                    
 public void salary()
   {
     double tcost, tt;
     int choice3;
     Scanner sc= new Scanner(System.in);
     System.out.println("Please choose the corresponding Doctor ID to book an appointment");
     System.out.println("1.Dr.Malla Reddy\n2.Dr. Anuradha");
     choice3=sc.nextInt();
     switch(choice3)
          {
                 case 1:System.out.println("Doctor: Dr. Malla Redyy");
                 tcost= 500+ Math.floor(Math.random()*1000);
                 System.out.println("Doctor's fees:"+tcost);
                 tt= c+tcost;
                 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                 System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                  break;

                 case 2:System.out.println("Doctor: Dr Anuradha");
                 tcost= 500+ Math.floor(Math.random() * 1000);
                 System.out.println("Doctor's fees:"+tcost);
                 tt= c+tcost;
                 System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                 break;
            }

  }
	    public void appointment()
	{
	    int register;
	System.out.println("If for any reason you want to cancel your appointment");
        System.out.println("Reply 1 to confirm the appointment\nReply 2 to cancel to appointment");
        Scanner sc= new Scanner(System.in);        
        int choice4= sc.nextInt();
                switch(choice4)
                {
                case 1: register= 10000+ (int)(Math.floor(Math.random()*50000));
                        System.out.println("Your appointment has been booked. Your appointment number is "+register);
                        System.out.println("-*-*-*-*-*-*_THANK YOU -*-*-*-*-*-*-*");
                        break;

                case 2:System.out.println("Note: You will be refunded the Doctor's fees only. ");
                           System.out.println("-*-*-*-*-*-*_THANK YOU -*-*-*-*-*-*-*");
	           break;
        
                }
}
}

class nofield extends Display implements Structure1
{
nofield(String name, char gender, String phono, int cost)
{
	super(name, gender, phono, cost);

}

    public void appointment()
	{
	System.out.println("There is no field that you are searching for your checkup. We are extremely sorry for this");
		        	
                }
}
	



    