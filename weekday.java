import java.io.*;
import java.util.Scanner;
public class weekday
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Number: ");
int a=s.nextInt();
s.close();
switch(a)
{
case 1:
System.out.println("Its Sunday");
break;

case 2:
System.out.println("Its Monday");
break;

case 3:
System.out.println("Its Tuesday");
break;

case 4:
System.out.println("Its Wednesday");
break;

case 5:
System.out.println("Its Thursday");
break;

case 6:
System.out.println("Its Friday");
break;

case 7:
System.out.println("Its Saturday");
break;

default:
System.out.println("Entered Invalid");
}
}
}
