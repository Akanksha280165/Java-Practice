import java.util.Scanner;

public class DefaultValue
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the datatype");
  String string= sc.nextLine();
  
  if(string.equals("reference datatype"))
  {
     System.out.println("default value of "+string+"is null");
   
  }
  
 else 
  {
    if(string.equals("primitive datatype"))
	{
	 System.out.print("enter the name of primitive datatype whose default value you need :");
	 String s2=sc.nextLine();
	 
	 if(s2.equals("byte"))
	 {
      
	  System.out.println("default value of "+s2+" is 0");
		 
	 }	 
	 
    else if(s2.equals("short"))
	 {
      
	  System.out.println("default value of "+s2+" is 0");
		 
	 }	 
	 
	 else if(s2.equals("int"))
	 {
      
	  System.out.println("default value of "+s2+" is 0");
		 
	 }	 
	 
	 else if(s2.equals("long"))
	 {
      
	  System.out.println("default value of "+s2+" is 0");
		 
	 }	 
	 
	 else if(s2.equals("float"))
	 {
      
	  System.out.println("default value of "+s2+" is 0.0f");
		 
	 }	 
	 
	 else if(s2.equals("double"))
	 {
      
	  System.out.println("default value of "+s2+" is 0.0");
		 
	 }

    else
	{
		System.out.println("invalid input");
	}	 
	 
	 
	}
  }
  
 }
}