import java.io.*;
import java.util.*;
public class reverse{
public static void main(String[] args){
int num=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number: ");
int a=s.nextInt();
 while(a != 0)
      {
          num = num * 10;
          num = num + a%10;
          a = a/10;
      }
System.out.println("Reverse of Entered Number: "+num);
}
}