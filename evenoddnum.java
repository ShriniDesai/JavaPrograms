import java.io.*;
import java.util.*;
public class evenoddnum{
public static void main(String[] args){
	int e=0,o=0;
Scanner s=new Scanner(System.in);
 System.out.println("Enter No. of Elements: ");
  int n=s.nextInt(); 
int a[]=new int[n];
System.out.println("Enter the Numbers: ");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
	if(a[i]%2==0){
	 e=e+a[i];
	}
	else{
	o=o+a[i];
	}
	}
	
System.out.println("Sum of Even Numbers: "+ e);
System.out.println("Sum of Odd Numbers: "+ o);
}
}