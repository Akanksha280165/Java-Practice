import java.util.Scanner;
class Operation
{

 public static void main(String args[]){
 
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter the first number");
  int num1 =sc.nextInt();
  
  System.out.println("enter the second number");
  int num2 =sc.nextInt();
  
  
  System.out.println("Result of Addition is ="+ (num1+num2));
  System.out.println("Result of multiplicationis ="+ (num1*num2));
  System.out.println("result of division is ="+ (num1/num2));
  
  
  
  
 }
}