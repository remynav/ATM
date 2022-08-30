
public class ATMTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankATM test= new bankATM();
		test.openAccount(455, 500.2);
		System.out.println(test.checkBalance(455));
		
		test.depositMoney(455, 10);
		System.out.println(test.checkBalance(455));
		
		test.withdrawMoney(455, 10);
		System.out.println(test.checkBalance(455));
		
		
	}

}
