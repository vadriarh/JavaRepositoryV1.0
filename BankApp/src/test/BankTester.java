package test;

import model.Account;
import model.Client;
import services.AccountServices;
import services.ClientServices;
import services.exceptions.ClientOperationException;

public class BankTester {

	public static void main(String[] args) {
//		Client cl1 = new Client(1258546321, "John", "Smoke");
//		cl1.setAccount(new Account("ALFA3051054210005845", "BYN"));
//		cl1.getAccount().setBalance(52000);
//
//		ClientServices.info(cl1);
//
//		AccountServices.deposite(cl1, 12000);
//		ClientServices.info(cl1);
//
//		AccountServices.withdraw(cl1, 65000);
//		ClientServices.info(cl1);


		Client cl2 = new Client(1232458411, "Lisa", null);
		cl2.setAccount(new Account("MT564132582580005845", "BYN"));
		cl2.getAccount().setBalance(15000);

		try {
			ClientServices.info(null);
		} catch (ClientOperationException e) {			
			//e.printStackTrace();
			System.err.println(e.getMessage()+". Status: "+e.getStatus()+" "+(e.getCause()==null?"":(" Nested exception is "+e.getCause())));
		}
		
		try {
			ClientServices.info(cl2);
		} catch (ClientOperationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e.getMessage()+". Status: "+e.getStatus()+" "+(e.getCause()==null?"":(" Nested exception is "+e.getCause())));
		}
// 
//		AccountServices.withdraw(cl2, 14000);
//		ClientServices.info(cl2);
//
//		AccountServices.transfer(cl2, cl1, 5000);
//		ClientServices.info(cl1);
//		ClientServices.info(cl2);

	}

}
