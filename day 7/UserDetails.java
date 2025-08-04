public class UserDetails
{
 public static void main(String[] args)
 {
   SbiAccount akanksha = new SbiAccount();
   
    akanksha.accountNum ="01109320152025";
	akanksha.accountType="savings";
	akanksha.add="renukoot adm colony";
	akanksha.balance=2000;
	
    
   SbiAccount rekha = new SbiAccount();
 
  rekha.accountNum="2004196519912008";
  rekha.accountType="savings";
  rekha.add="prayagraj manda road";
  rekha.balance=50000;
  
  System.out.println("akanksha's balance :" +akanksha.balance);
  System.out.println("rekha's balance :" +rekha.balance);
  System.out.println("interest rate" +SbiAccount.interestRate);
  
  
 }
 
  
}