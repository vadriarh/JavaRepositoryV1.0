package pack2;

public class Customer {
	private int uid;
	private String name;
	private String category;
	private double cash;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int uid, String name, String category, double cash) {
		super();
		this.uid=uid;
		this.name = name;
		this.category = category;
		this.cash = cash;
	}

	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", name=" + name + ", category=" + category + ", cash=" + cash + "]";
	}
	
	

}
