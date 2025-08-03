class PrimitiveConcept
{
	
  public static void main(String[] args)
  {
    Amount amt = new Amount();
	int value= 10;
	byte value1=11;
	char ch='R';
	short sh=2;
	float f=1.7f;
	double d=3.678;
	long l=900;
	boolean b=false;
	System.out.println("value of primitive datatype is "+ value);
	System.out.println("value of primitive datatype is "+ value1);
	System.out.println("value of primitive datatype is "+ ch);
	System.out.println("value of primitive datatype is "+ sh);
	System.out.println("value of primitive datatype is "+ f);
	System.out.println("value of primitive datatype is "+ d);
	System.out.println("value of primitive datatype is "+ l);
	System.out.println("value of primitive datatype is "+ b);
	
	
	System.out.println("value of non-primitive datatype is "+ amt);
	
  }
}