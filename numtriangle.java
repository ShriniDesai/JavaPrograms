import java.io.*;

public class numtriangle{
public static void main(String[] args){
	int n=5;
 int k = 2*n - 2;
   
       for (int i=1; i<=n; i++)
        {
            for (int j=0; j<k; j++)
            {
               System.out.print(" ");
            }
  
            k = k - 1;
             
            for (int j=1;j<=i*2-1;j++)
            {
               System.out.print(i);
            }
             
            System.out.println();
}
}}