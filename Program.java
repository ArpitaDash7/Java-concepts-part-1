import java.io.*;
import java.util.*;
class Posting
{

static int courseWork;
static int aptTest;
static int techTest;
static int interview;

static void Programmerjob()
{
       double t1;
       int ch1;
       int ch3;
       Scanner sc= new Scanner(System.in);
       t1=((courseWork+aptTest+techTest+interview)*100)/400;
       if(t1>=80)
       {
         System.out.println("Employee is eligible for post of Programmer");
         System.out.println("-------------------------------------------");
         System.out.println("Choose:-");
         System.out.println("1.Accept the offer for the post of Programmer");
         System.out.println("2.Do you want to re-register for any other post");
         System.out.println("-------------------------------------------");
         ch1=sc.nextInt();
         switch(ch1)
         {
          case 1: System.out.println("SUCCESSFULLY ACCEPTED");
                  Date timenow = new Date();
                  System.out.println("Date of Accepting: "+timenow.toString());
                  System.out.println("-------------------------------");
                  System.out.println("WELCOME TO D.E.SHAW");
                  System.out.println("-------------------------------");
                  break;

          case 2:  System.out.println("Do you want to re-register for Team-Leader or Project Manager");
                   System.out.println("1-Team-Leader");
                   System.out.println("2.Project Manager");
                   ch3=sc.nextInt();
                   if(ch3==1)
                   {
                    System.out.println("You have successfully registered for the post of Team-Leader ");
                   }
                   else if(ch3==2)
                   {
                    System.out.println("You have successfully registered for the post of Project-Manager");
                   }
                   else
                   {
                    System.out.println("INVALID CHOICE");
                   }
                   break;
         }
       }
       else
       {
         System.out.println("Not eligible for post of programmer because percentage is less than 80");
       }
       

}

static void Teamleader()
{
double t2;
 int ch4,ch5;
 Scanner sc= new Scanner(System.in);
 t2=((techTest+interview)*100)/200;
 if(t2>=85)
 {
         System.out.println("Employee is eligible for post of Team Leader");
         System.out.println("-------------------------------------------");
         System.out.println("Choose:-");
         System.out.println("1.Accept the offer for the post of Team Leader");
         System.out.println("2.Do you want to re-register for any other post");
         System.out.println("-------------------------------------------");
         ch4=sc.nextInt();
         switch(ch4)
         {
          case 1: System.out.println("SUCCESSFULLY ACCEPTED");
                  Date timenow = new Date();
                  System.out.println("Date of Accepting: "+timenow.toString());
                  System.out.println("-------------------------------");
                  System.out.println("WELCOME TO D.E.SHAW");
                  System.out.println("-------------------------------");
                  break;

          case 2:  System.out.println("Do you want to re-register for Programmer or Project Manager");
                   System.out.println("1-Programmer");
                   System.out.println("2.Project Manager");
                   ch5=sc.nextInt();
                   if(ch5==1)
                   {
                    System.out.println("You have successfully registered for the post of Programmer");
                   }
                   else if(ch5==2)
                   {
                    System.out.println("You have successfully registered for the post of Project-Manager");
                   }
                   else
                   {
                    System.out.println("INVALID CHOICE");
                   }
                   break;
         }
       }
 
 else
 {
   System.out.println("Not eligible for the post of Team Leader because percentage is less than 85");
 }
}

static void Project()
{
double t3;
int ch6,ch7;
Scanner sc= new Scanner(System.in);
        t3=interview;
      if(t3>=85)
      {
         System.out.println("Employee is eligible for post of Project Manager");
         System.out.println("-------------------------------------------");
         System.out.println("Choose:-");
         System.out.println("1.Accept the offer for the post of Project-Manager");
         System.out.println("2.Do you want to re-register for any other post");
         System.out.println("-------------------------------------------");
         ch6=sc.nextInt();
         switch(ch6)
         {
          case 1: System.out.println("SUCCESSFULLY ACCEPTED");
                  Date timenow = new Date();
                  System.out.println("Date of Accepting: "+timenow.toString());
                  System.out.println("-------------------------------");
                  System.out.println("WELCOME TO D.E.SHAW");
                  System.out.println("-------------------------------");
                  break;

          case 2:  System.out.println("Do you want to re-register for Team-Leader or Programmer");
                   System.out.println("1-Team-Leader");
                   System.out.println("2.Programmer");
                   ch7=sc.nextInt();
                   if(ch7==1)
                   {
                    System.out.println("You have successfully registered for the post of Team-Leader ");
                   }
                   else if(ch7==2)
                   {
                    System.out.println("You have successfully registered for the post of Programmer");
                   }
                   else
                   {
                    System.out.println("INVALID CHOICE");
                   }
                   break;
         }
       }
     
      else
      {
        System.out.println("Not eligible for the post of Project Manager because percentage is less than 85 ");
      }
}

}

class Program
{
public static void main(String args[])
{
int ch,choice;
Scanner sc= new Scanner(System.in);
do
{
System.out.println("KINDLY CHOOSE TO CHECK IF YOU ARE ELIGIBLE FOR THE REQUIRED POST");
System.out.println("1.Programmer");
System.out.println("2.Team Leader");
System.out.println("3.Project Manager");
System.out.println("Enter your choice");
ch=sc.nextInt();
switch(ch)
{
  case 1:
         System.out.println("Enter marks of coursework");
         int cw= sc.nextInt();
         System.out.println("Enter marks of apt test");
         int at= sc.nextInt();
         System.out.println("Enter marks of tech test");
         int tt=sc.nextInt();
         System.out.println("Enter marks of interview");
         int i=sc.nextInt();
         Posting.courseWork=cw;
         Posting.aptTest=at;
         Posting.techTest=tt;
         Posting.interview=i;
         Posting.Programmerjob();
         break;

   case 2:
         System.out.println("Enter marks of tech test");
         int tt1=sc.nextInt();
         System.out.println("Enter marks of interview");
         int i1=sc.nextInt();
         Posting.techTest=tt1;
         Posting.interview=i1;
         Posting.Teamleader();
         break;

   case 3:
         System.out.println("Enter marks of interview");
         int i2=sc.nextInt();
         Posting.interview=i2;
         Posting.Project();
         break;

   default: System.out.println("Wrong choice");
                 break;
}System.out.println("Do you want to continue 1 for yes");
    choice= sc.nextInt();
     }while(choice==1);
}

}