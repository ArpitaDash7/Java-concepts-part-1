    import java.util.*;
    import java.io.*;
    import java.lang.Math;
    class Model
    {
    public static void main(String args[]) throws IOException
    {
              java.util.Date date = new java.util.Date();    
              System.out.println(date);      
              System.out.println("*-*-*-*-*-*-*-*-*-*Welcome to program*-*-*-*-*-*-*-*-*-*-*-*-*");
              System.out.println("*-*-*-*Program to demonstrate use of inheritence in java-*-*-*");
              Scanner sc=new Scanner(System.in);
              char choice;
               System.out.println("\n\n*-*-*-*-*-*-*-Enter the information of patient*-*-*-*-*-*-*-*");
               System.out.println("Enter the name of patient");
               String n=sc.nextLine();
               System.out.println("Please share patient Phone number");
               long phone=sc.nextLong();
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Please Choose patient Gender M/F ");
               String gen = reader.readLine();
               int ch,c;
               System.out.println("Have you registered? 1 for yes/ 0 for no");
               ch=sc.nextInt();
               if(ch==1)
               {
               System.out.println("You are already an member! Welcome to Apollo Hospital");
               System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
               c=0;
               display a= new display(n,gen,phone,c);
               a.tdisplay(n,gen,phone,c);
               }
               else
               {
               System.out.println("You have to deposit Rs.400 for registration! Welcome to Apollo Hospital");
               System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
               c=400;
               display a= new display(n,gen,phone,c);
                a.tdisplay(n,gen,phone,c);
               }
               Total b= new Total(n,gen,phone,c);
              
       }
    }

    class Hospital
    {
    Scanner sc= new Scanner(System.in);
    String name,gender;
    int cost;
    long phono;
    Hospital(String name, String gender, long phono, int cost)
    {
    name=this.name;
    gender=this.gender;
    phono=this.phono;
    cost=this.cost;

    }
    }

    class display extends Hospital
    {
    int cost;
    display(String name, String gender, long phono, int cost)
    {
    super(name, gender, phono, cost);
    
    }
    void tdisplay(String name, String gender, long phono, int cost)
   {
    System.out.println();
    System.out.println("NAME:"+name);
    System.out.println("GENDER:"+gender);
    System.out.println("PHONE NUMBER:"+phono);
    System.out.println();
     
}
}

    class Total extends display
    {
    Total(String name, String gender, long phono, int cost)
    {
    super(name, gender,phono, cost);
    int choice2,choice3;
    int register;
    double tt,tcost;
    Scanner sc= new Scanner(System.in);
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      System.out.println("Please choose the corresponding speciality to book an appointment.");
      System.out.println("1.Dermatology\n2.Internal Medicine\n3.Padiatrics");
          choice2= sc.nextInt();
          switch(choice2)
          {
          case 1: System.out.println("Doctor's fees:"+tcost);
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
                    break;

            case 2:System.out.println("Please choose the corresponding Doctor ID to book an appointment");
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
                     break;
             case 3: System.out.println("Please choose the corresponding Doctor ID to book an appointment");
                       System.out.println("1.Dr. Malla Reddy \n2.Dr Anuradha");
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
                     break;
              default: System.out.println("Wrong choice\n");
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

                case 2: System.out.println("Note: You will be refunded the Doctor's fees only. ");
                        System.out.println("-*-*-*-*-*-*_THANK YOU -*-*-*-*-*-*-*");

              }

    }
    }


