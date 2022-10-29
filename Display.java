package abc;
import java.io.*;
public class Display
{
    public String n;
    public char g;
    public String p;
    public int c;
    public  Display(String name, char gender, String phono, int cost)
    {
        this.n=name;
        this.g=gender;
        this.p=phono;
        this.c=cost;
    }
    
     public void display()
    {
        System.out.println();
        System.out.println("PATIENT'S DETAILS:-");
        System.out.println("NAME:"+n);  
        if(g=='F' || g=='f')
        System.out.println("GENDER:female");
        else  if(g=='M' || g=='m')
        System.out.println("GENDER:Male");
        else
        System.out.println("GENDER: not specified");
        System.out.println("PHONE NUMBER:"+p);
        System.out.println();
    }
}