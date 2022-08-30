import java.util.ArrayList;
import java.util.HashMap;

public class bankATM {
	private HashMap<Integer, Double> accounts;
	
	
	public bankATM() {
		accounts= new HashMap<Integer, Double>();
	}
	
	public void openAccount(int accNum) {
		accounts.put(accNum, 0.0);
	}
	
	public void openAccount(int accNum, double balance) {
		accounts.put(accNum, balance);
	}
	
	public void closeAccount(int accNum) {
		//Closes the account, only if there is no balance!
		if(accounts.get(accNum) == 0.0) {
			accounts.remove(accNum);
		}
	}
	
	public double checkBalance(int accNum) {
//		Returns a double the exact account value of all deposits into the account
//		Returns 0.0 if there is no valid account
		if(accounts.containsKey(accNum)==false) {
			return 0.0;
		}
		return accounts.get(accNum);
	}
	
	public boolean depositMoney(int accNum, double amountToDeposit) {
		//Returns true/false depending on success or failure of deposit
		if(accounts.containsKey(accNum)==false) {
			return false;
		}
		double newBal=accounts.get(accNum) + amountToDeposit;
		accounts.replace(accNum, newBal);
		return true;
	}
	
	public boolean withdrawMoney(int accNum, double amountToDeposit) {
		//Returns true/false depending on success or failure of deposit
		if(accounts.containsKey(accNum)==false) {
			return false;
		}
		double newBal=accounts.get(accNum) - amountToDeposit;
		accounts.replace(accNum, newBal);
		return true;
	}
	
}
