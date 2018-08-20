import java.io.*;
import java.util.*;
public class count{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number of Elements: ");
int n=s.nextInt();
int countpos=0, countneg=0, countzero=0;
 int a[]=new int[n];
 System.out.println("Enter Numbers: ");
 
  for(int i=0;i<n;i++)
  {
	  a[i]=s.nextInt();
	if(a[i]<0){
		counterneg++;
	}
	else if(a[i]>0){
		counterpos++;
	}
	else {
		counterzero++;
	}
    }
	System.out.println("Count of Negative Numbers are: "+counterneg);
	System.out.println("Count of Positive Numbers are: "+counterpos);
	System.out.println("Count of Zero Numbers are: "+counterzero);
	}
    }  


