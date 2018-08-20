import java.io.*;
import java.util.Scanner;
public class selectoperator
{
public static void main(String[] args)
{
int c;
Scanner s=new Scanner(System.in);
System.out.println("Enter First Number: ");
int a=s.nextInt();

System.out.println("Enter Second Number: ");
int b=s.nextInt();

System.out.println("Operator: \n1. Addition \n2.Substraction \n3.Division \n4.Multiplication ");
System.out.println("Enter your Choice");
int operator=s.nextInt();
s.close();

switch(operator)
{
case 1:
c=a+b;
System.out.println("Addition is " +c);
break;

case 2:
c=a-b;
System.out.println("Substraction is "+c);
break;

case 3:
c=a/b;
System.out.println("Division is "+c);
break;

case 4:
c=a*b;
System.out.println("Multiplication is "+c);
break;

default:
System.out.println("Choice is Invalid");
}
}
}