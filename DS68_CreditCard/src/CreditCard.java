public class CreditCard {

	private String number;
	private String name;
	private String bank;
	private double balance;
	private int limit;
	
	//Constructor
	CreditCard(String num, String na, String bk, double bl, int lm){
		number = num;
		name = na;
		bank = bk;
		balance = bl;
		limit = lm;
	}
	
	//Accessor Method
	public String getNumber(){
		return number;
	}
	
	public String getName(){
		return name;
	}
	
	public String getBank(){
		return bank;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public int getLimit(){
		return limit;
	}
	
	public boolean chargeIt(double price){
		if (price + balance > (double)limit)
			return false;
		balance += price;
			return true;
	}
	
	public void makePayment(double payment){
		balance -= payment; //balance = balance - payment
	}
	
	public static void printCard(CreditCard c){
		System.out.println("Number is " + c.getNumber());
		System.out.println("Name is " + c.getName());
		System.out.println("Bank is " + c.getBank());
		System.out.println("Balance is " + c.getBalance());
		System.out.println("Limit is " + c.getLimit());
	}
	
}	