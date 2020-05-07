import java.util.Scanner;

public class Solution
{

 public static void main(String[] args)
 {
  
  int pro=1;
  
  
  Scanner s = new Scanner(System.in);
  int b = s.nextInt();
  
  int e = s.nextInt();
  
  
  for (int i=1;i<=e;i++)
  {
   pro = pro * b;
   
  }
  
   System.out.println(pro);
  
  

 }

}
