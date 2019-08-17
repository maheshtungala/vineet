package basics;

public class BOA {
    double balance = 25000.75;
    double withdraw(double x) {
      balance = balance-x; 
    	return x;    	
    }
	public static void main(String[] args) {
		
         BOA vineet = new BOA();
         System.out.println("The opening balance is " +vineet.balance);
         System.out.println("******************************************");
         
         double cash = vineet.withdraw(1200);
         
         System.out.println("The amount withdrawn is " +cash);
         System.out.println("The current balance is " +vineet.balance);
         
         System.out.println("******************************************");
         cash = vineet.withdraw(15000);
         System.out.println("The amount withdrawn is " +cash);
         System.out.println("The current balance is " +vineet.balance);
         
         
         
	}

}
