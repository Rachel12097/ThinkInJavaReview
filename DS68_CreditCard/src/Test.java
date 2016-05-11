public class Test {

	public static void main(String[] args) {
		CreditCard wallet[] = new CreditCard[10];
		wallet [0] = new CreditCard("1234","Rachel Chen","Bank of America",0.0,1500);
		wallet [1] = new CreditCard("5678","Rachel Chen","Bank of Taiwan",0.0,2500);
		wallet [2] = new CreditCard("9876","Rachel Chen","Bank of UK",0.0,3500);
		
		for(int i=1; i<=20; i++){
			wallet[0].chargeIt((double)i);
			wallet[1].chargeIt(2.0*i);//implicit cast
			wallet[2].chargeIt((double)3*i);//explicit cast
		}
		
		for (int i=0; i<3; i++){
			CreditCard.printCard(wallet[i]);
			while(wallet[i].getBalance()>100.0){
				wallet[i].makePayment(100.0);
				System.out.println("The New Balance is " + wallet[i].getBalance());
			}
		}
	}

}
