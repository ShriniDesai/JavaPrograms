import java.util.*;

public class numtoword
{
  public void pw(int n,String ch)
  {
    String  one[]={" "," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen","Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
 
    String ten[]={" "," "," Twenty"," Thirty"," Forty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
 
    if(n > 19) { System.out.print(ten[n/10]+" "+one[n%10]);} else { System.out.print(one[n]);}
    if(n > 0)System.out.print(ch);
  }
  public static void main(String[] args)
  {
    int n=0;
    Scanner scanf = new Scanner(System.in);
    System.out.println("Enter an integer number: ");
    n = scanf.nextInt();
    
    if(n<=0)  {                 
      System.out.println("Enter numbers greater than 0");
   }
   else
   {
      numtoword a = new numtoword();
      a.pw((n/1000000000)," Hundred");
      a.pw((n/10000000)%100," Crore");
      a.pw(((n/100000)%100)," lakh");
      a.pw(((n/1000)%100)," Thousand");
      a.pw(((n/100)%10)," Hundred");
      a.pw((n%100)," ");
    }
  }
}