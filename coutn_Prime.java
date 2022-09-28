import java.util.*;
import java. lang.*;

public class coutn_Prime {

  
public static void main(String[] args)
{
System.out.println("Enter the range");
Scanner scn = new Scanner(System.in);
int low = scn.nextInt();
int high = scn.nextInt();
System.out.println("Enter Number to start:");
for (int n =low ; n<high ; n++)
{
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
      System.out.println(n);
    
}
}
}



    