package services;

import model.Client;
import services.exceptions.AccountOperationException;
import services.exceptions.ClientOperationException;
import services.exceptions.Statuses;


/**
 * @param c-the bank client
 * @throw ClientOperationException - in case invalid client
 *
 */
public class ClientServices {
	public static void info(Client c) throws ClientOperationException{
		
			if(c!=null&&(c.getUid()<=0
					||c.getName()==null
					||c.getSurname()==null)) {
				throw new ClientOperationException("Invalid Client Data", Statuses.INVALID_CLIENT);		
			}
			
			
		
			try {
				c.getClass();//NullPointer can be throw
			} catch (Exception e) {//add cause Exception
				// TODO: handle exception
				throw new ClientOperationException("Invalid Client Instance",e, Statuses.INVALID_CLIENT);
			}
			
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(c);
		
	}

}
