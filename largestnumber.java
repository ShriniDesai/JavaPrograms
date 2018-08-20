import java.io.*;
import java.util.Scanner;
public class largestnumber
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter First Number: ");
int a=s.nextInt();
System.out.println("Enter Second Number: ");
int b=s.nextInt();
System.out.println("Enter Third Number: ");
int c=s.nextInt();
s.close();
if(a>b&&a>c){
System.out.println("First Number="+a+" is largest Number");
}
else if(b>a&&b>c){
System.out.println("Second Number="+b+" is largest Number");
}
else if(c>a&&c>b){
System.out.println("Third Number="+c+" is largest Number");
}
else{
	System.out.println("Entered Incorrect");
}
}
}