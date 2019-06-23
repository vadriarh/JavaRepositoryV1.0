package pack2;

public class RealizationDAO implements CustomerDAO {

	@Override
	public Customer[] getAll() {
		if (App.data != null) {
			System.out.println("EXPORT SUCCESS.");
			return App.data;
		} else {
			System.out.println("EXPORT FAILED. RETURN IS NULL.");
			return null;
		}
	}

	@Override
	public Customer getByld(int code) {
		if (App.data != null) {
			for (Customer customer : App.data) {
				if (customer.getUid() == code) {
					System.out.println("SEARCH SUCCESS. RETURN CUSTOMER.");
					return customer;
				}
			}
		}
		System.out.println("SEARCH FAILED. RETURN IS NULL.");
		return null;
	}

	@Override
	public boolean add(Customer customer) {
		if (App.data != null && customer != null) {
			int sizeArr=App.data.length;
			if(customer.getUid()!=-1) {
				for (Customer customerData : App.data) {
					if (customerData.getUid() == customer.getUid()) {
						System.out.println("THE CUSTOMER IS ALREADY THERE. RETURN FALSE.");
						return false;
					}
				}
			}			
			App.maxUid++;
			Customer[] newData = new Customer[sizeArr + 1];
			for (int i = 0; i < sizeArr; i++) {
				newData[i]=App.data[i];
			}
			newData[sizeArr]=new Customer();			
			newData[sizeArr] = customer;
			newData[sizeArr].setUid(App.maxUid);
			App.data = newData;
			System.out.println("ADDING SUCCESS. RETURN TRUE.");
			return true;
		}else if (App.data == null) {
			System.out.println("NO LIST DATA. CHECK INPUT. RETURN IS NULL.");
		} else {
			System.out.println("NO CUSTOMER DATA. CHECK INPUT. RETURN IS NULL.");
		}
		return false;
	}

	@Override
	public boolean update(Customer customer) {
		if(App.data!=null&&customer!=null) {
			for (int i = 0; i < App.data.length; i++) {
				if(App.data[i].getUid()==customer.getUid()) {
					System.out.println("THE CUSTOMER IS MATCH.");
					App.data[i]=customer;
					System.out.println("THE CUSTOMER UPDATE. RETURN TRUE.");
					return true;
				}
			}
			System.out.println("NO MATCHES. RETURN FALSE.");
		}else if (App.data == null) {
			System.out.println("NO LIST DATA. CHECK INPUT. RETURN IS NULL.");
		} else {
			System.out.println("NO CUSTOMER DATA. CHECK INPUT. RETURN IS NULL.");
		}
		return false;
	}

	@Override
	public boolean delete(Customer customer) {
		if (App.data != null && customer != null) {
			int sizeArr=App.data.length;
			for (int i = 0; i < sizeArr; i++) {
				if(App.data[i].getUid()==customer.getUid()) {
					System.out.println("THE CUSTOMER IS ALREADY THERE.");
					Customer[] newData = new Customer[sizeArr - 1];
					for (int j = 0; j < i; j++) {
						newData[j]=App.data[j];
					}
					for (int j = i+1; j < sizeArr; j++) {
						newData[j-1]=App.data[j];
					}
					App.data = newData;
					System.out.println("THE CUSTOMER DELETED. ");
					System.out.println("CUSTOMER DATA REWRITE. RETURN TRUE.");
					return true;
				}
			}
			System.out.println("NO MATCHES. RETURN FALSE.");
			return false;			
		}else if (App.data == null) {
			System.out.println("NO LIST DATA. CHECK INPUT. RETURN IS NULL.");
		} else {
			System.out.println("NO CUSTOMER DATA. CHECK INPUT. RETURN IS NULL.");
		}
		return false;
	}

}
