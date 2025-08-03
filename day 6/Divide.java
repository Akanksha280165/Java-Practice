import java.util.Scanner;

class Divisibilty

{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number");
  int a=sc.nextInt();
  
  if(a%3=0 && a%5=0 )
  {
   System.out.println("number is divisible by 3 and 5");
  }
   else if(a%3=0 && a%5!=0)
   {
   System.out.println("number is divisible by 3 only");
   
   }
   else if(a%3!=0 && a%5=0)
   {
   System.out.println("number is divisible by 5 only");
   
   }
   else if(a%3!=0 && a%5!=0)
   {
   System.out.println("number is not divisible by 3 and 5");
   
   }
   
 } 
}