import java.io.*;
import java.util.Scanner;
public class number
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Number: ");
int a=s.nextInt();
s.close();
if(a%2==0){
System.out.println("Entered Number is Even");
}
else{
System.out.println("Entered Number is Odd");
}
}
}