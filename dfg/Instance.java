class InstanceVar
{
 byte b1;
 byte b=3;
 short sh1=6;
 short sh;
 int value;
 int value1=10;
 
 
 public static void main(String[] args)
 {
  System.out.println("this is main method");
 
 
 
 
   InstanceVar in= new InstanceVar();
   
   System.out.println("the value of  instance variable is "+ in.b1);
   System.out.println("the value of  instance variable is "+ in.b);
   System.out.println("the value of  instance variable is "+ in.sh1);
   System.out.println("the value of  instance variable is "+ in.sh);
   System.out.println("the value of  instance variable is "+ in.value);
   System.out.println("the value of  instance variable is "+ in.value1);
   
   
 } 
}