import java.util.*;
import java. lang.*;

class Prime_Number{

  
public static void main(String[] args)
{
  System.out.println("Start Proceedingss");
Scanner scn = new Scanner(System.in);
int t = scn.nextInt();
System.out.println("Enter Number to start:");
for (int i =0 ; i<t ; i++)
{
  int n =scn.nextInt();
  int count =0;
  for(int div=2;div*div<=n;div++)
  {
    if(n%div==0)
    {
      count++;
      break;
   
  }
  }
    if (count==0)
      System.out.println("Primr");
    else
    System.out.println("NOt primr");
}
}
}


