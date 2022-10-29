import java.io.*;
import java.util.*;

public class Airline_Reservation {
    public static void main(String[] args) {
        int choice, ch, ch1, ch3;
        int fseat = 1;
        int Economy = 6;
        String x, ch2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your choice: 1- first class 2- Economy class");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Welcome to PRIVATE VISTARA AIRLINES(FIRST CLASS)!");
                    if (fseat <= 5) {
                        System.out.println("seat available " + fseat);
                        fseat++;
                        System.out.println("What facility you want");
                        System.out.println("1.Veg food\n2.Non Veg food\n3.No food");
                        ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                System.out
                                        .println("1.Veg food at $6 extra and provide boarding pass after web-checkin");
                                break;
                            case 2:
                                System.out.println(
                                        "2.Non Veg food at $8 extra and provide boarding pass after web-checkin");
                                break;
                            case 3:
                                System.out.println("3.No food and provide boarding pass after web-checkin");
                                break;
                        }
                    } else {
                        System.out.println("Is it acceptable to be placed in the Economy class (y / n)\t");
                        x = sc.nextLine();
                        if (x.equals("y")) {
                            System.out.println("Seat reserved in Economy class\t" + Economy);
                            Economy++;
                            System.out.println("What facility you want");
                            System.out.println("1.Veg food\n2.Non Veg food\n3.No food");
                            ch1 = sc.nextInt();
                            switch (ch1) {
                                case 1:
                                    System.out.println(
                                            "1.Veg food at $6 extra and provide boarding pass after web-checkin");
                                    break;
                                case 2:
                                    System.out.println(
                                            "2.Non Veg food at $8 extra and provide boarding pass after web-checkin");
                                    break;
                                case 3:
                                    System.out.println("3.No food and provide boarding pass after web-checkin");
                                    break;
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.\t");
                        }
                    }
                    System.out.println("Are you sure you want to go with this? y/n");
                    ch2 = sc.nextLine();
                    if (ch2.equals("y")) {
                        System.out.println("SUCCESSFULLY BOOKED");
                    }
                    break;

                case 2:
                    System.out.println("Welcome to PRIVATE VISTARA AIRLINES(ECONOMY CLASS)!");
                    if (Economy <= 10) {
                        System.out.println("seat available " + Economy);
                        Economy++;
                        System.out.println("What facility you want");
                        System.out.println("1.Veg food\n2.Non Veg food\n3.No food");
                        ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                System.out
                                        .println("1.Veg food at $6 extra and provide boarding pass after web-checkin");
                                break;
                            case 2:
                                System.out.println(
                                        "2.Non Veg food at $8 extra and provide boarding pass after web-checkin");
                                break;
                            case 3:
                                System.out.println("3.No food and provide boarding pass after web-checkin");
                                break;
                        }
                    } else {
                        System.out.println("Is it acceptable to be placed in the First class (y / n)\t");
                        x = sc.nextLine();
                        if (x.equals("y")) {
                            System.out.println("Seat reserved in First class\t" + fseat);
                            fseat++;
                            System.out.println("What facility you want");
                            System.out.println("1.Veg food\n2.Non Veg food\n3.No food");
                            ch1 = sc.nextInt();
                            switch (ch1) {
                                case 1:
                                    System.out.println(
                                            "1.Veg food at $6 extra and provide boarding pass after web-checkin");
                                    break;
                                case 2:
                                    System.out.println(
                                            "2.Non Veg food at $8 extra and provide boarding pass after web-checkin");
                                    break;
                                case 3:
                                    System.out.println("3.No food and provide boarding pass after web-checkin");
                                    break;
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.\t");
                        }
                    }
                    System.out.println("Are you sure you want to go with this? y/n");
                    ch2 = sc.nextLine();
                    if (ch2.equals("y")) {
                        System.out.println("SUCCESSFULLY BOOKED");
                    }
                    break;
            }
            System.out.println("Do you want to continue 1 for yes");
            choice = sc.nextInt();

        } while (choice == 1);
    }
}
