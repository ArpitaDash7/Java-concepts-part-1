    import java.util.*;
    import java.io.*;
    import java.lang.Math;
    class Abstractkey
    {
    public static void main(String args[]) throws IOException
    { 
              int c, ch,ch5;
              int register;
              java.util.Date date = new java.util.Date();    
              System.out.println(date);      
              System.out.println("*-*-*-*-*-*-*-*-*-*Welcome to program*-*-*-*-*-*-*-*-*-*-*-*-*");
              System.out.println("*-*-*-*Program to demonstrate use of inheritence in java-*-*-*");
              Scanner sc=new Scanner(System.in);
              char choice;
              do
              {
              System.out.println("\n\n*-*-*-*-*-*-*-Enter the information of patient*-*-*-*-*-*-*-*");
              System.out.println("Enter the name of patient");
              String n=sc.nextLine();
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
              Hospital h;
              if(ch==1)
              {
               System.out.println("You are already a member! Welcome to Apollo Hospital");
               System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
               c=0;
              }
              else
              {
                  System.out.println("You have to deposit Rs.400 for registration! Welcome to Apollo Hospital");
                  System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                  c=400;
              }
               System.out.println("Please choose the corresponding speciality to book an appointment.");
               System.out.println("1.Dermatology\n2.Internal Medicine\n3.Padiatrics");
               int choice2= sc.nextInt();
               switch(choice2)
               {
                  case 1: h= new Dermatology(n,gen, phone,c);
                              h.salary(c);
                               h.tdisplay();  
                             break;
                  case 2: h=new Internal(n,gen,phone,c);
                               h.salary(c);
                              h.tdisplay();  
                             break;
                  case 3: h=new  Paediatrics(n,gen,phone,c);
                              h.salary(c);
	              h.tdisplay();  
                              break;
                  default: System.out.println("WRONG CHOICE");
                                break;

              }
                        
        
              System.out.println("If for any reason you want to cancel your appointment");
              System.out.println("Reply 1 to confirm the appointment\nReply 2 to cancel to appointment");
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
   System.out.println("DO YOU WANT TO CONTINUE. Y/N");
   ch5=sc.next().charAt(0);
   }while(ch5=='Y' || ch5=='y');
  
   }
}

abstract class Hospital
    {
    String name;
    char gender;
    int cost;
    String phono;
    Hospital(String name, char gender, String phono, int cost)
    {
    this.name=name;
    this.gender=gender;
    this.phono=phono;
    this.cost=cost;
    }
   abstract public void salary(int cost);
   void tdisplay()
   {
    System.out.println();
    System.out.println("NAME:"+name);
    if(gender=='F' || gender=='f')
    System.out.println("GENDER:female");
    else  if(gender=='M' || gender=='m')
    System.out.println("GENDER:Male");
    else
    System.out.println("GENDER: not specified");
    System.out.println("PHONE NUMBER:"+phono);
    System.out.println();
     
}
}

class Dermatology extends Hospital
{
   Dermatology(String name, char gender, String phono, int cost)
   { 
      super(name, gender, phono, cost);
   }
   
   public void salary(int cost)
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
         tt= cost+tcost;
         System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
         System.out.println("Kindly pay Rs."+tt+" to book an appointment");
         break;

        case 2:System.out.println("Doctor: Dr Nikhil");
        tcost= 500+ Math.floor(Math.random() * 1000);
        System.out.println("Doctor's fees:"+tcost);
        tt= cost+tcost;
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Kindly pay Rs."+tt+" to book an appointment");
        break;
         }
        
     }
 }      

class Internal extends Hospital
{
   Internal(String name, char gender, String phono, int cost)
   { 
      super(name, gender, phono, cost);
   }
   
   public void salary(int cost)
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
                      tt= cost+tcost;
                      System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                      System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                      break;

               case 2:System.out.println("Doctor: Dr Ashok Kumar");
                      tcost= 500+ Math.floor(Math.random() * 1000);
                      System.out.println("Doctor's fees:"+tcost);
                      tt= cost+tcost;
                      System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                      System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                      break;
                }
                    
        
     }
 }   

class Paediatrics extends Hospital
{
    Paediatrics(String name, char gender, String phono, int cost)
   { 
      super(name, gender, phono, cost);
   }
   
   public void salary(int cost)
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
                 tt= cost+tcost;
                 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                 System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                  break;

                 case 2:System.out.println("Doctor: Dr Anuradha");
                 tcost= 500+ Math.floor(Math.random() * 1000);
                 System.out.println("Doctor's fees:"+tcost);
                 tt= cost+tcost;
                 System.out.println("Kindly pay Rs."+tt+" to book an appointment");
                 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                 break;
            }
                    
        
     }
 }      



