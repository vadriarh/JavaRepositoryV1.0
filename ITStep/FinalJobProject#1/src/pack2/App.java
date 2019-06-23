package pack2;



public class App {
	static int maxUid = 0;
	static Customer[] data;
	private static String[] names = { "�����", "�������", "���������", "������", "���������", "�������", "�������",
			"�������", "��������", "������", "�����", "�������", "�����", "��������", "�������", "�������", "���� ",
			"�����", "������", "��������", "������", "�����", "������", "��������", "�������", "��������", "������",
			"���������� ", "�������", "��������", "�������� ", "�������� ", "������ ", "���������", "�������",
			"�������� ", "���������", "�������", "����", "��������", "��������", "�������", "���������", "�������",
			"��������", "�������", "�������", "������", "����", "������", "��������", "������ ", "����� ", "������",
			"�����", "�������", "�������", "�����", "�������", "�������", "������", "�������", "�����", "��������",
			"����", "�������", "������", "�������", "����", "����", "�������", "������", "����", "�������", "�����",
			"����", "����������", "������� ", "������", "������", "������", "��� ", "������ ", "�������", "������� ",
			"����������", "��������", "������", "�������", "���������", "��� ", "������", "�������", "���� ", "�����",
			"������", "����������", "�����", "������", "���� ", "������", "������", "��������", "�����", "�������� ",
			"��������", "������", "��������", "����� ", "������", "�������", "������", "�������", "�������", "�����",
			"����", "������", "�����", "�����������", "��������", "ϸ��", "������ ", "��������", "�����", "����",
			"��������", "��������", "������", "��������", "������", "����� ", "���������", "������", "�����", "�������",
			"������ ", "���������", "���������", "���������", "����", "������", "���������", "��������� ", "�����",
			"��������", "���������", "������", "�����", "�������", "�����", "�����", "����� ", "������", "������",
			"������", "Ը���", "�������", "�����", "������", "��������", "�����", "������", "����", "�������",
			"���������", "������", "�����", "����", "����", "�����", "����", "����", "�������" };
	private static String[] categoryes = { "���", "�����", "������", "������", "������", "��������", "�����������" };

	public static void main(String[] args) {
		System.out.println("\t\t\tGenerate first data\n====================================================");
		generateSampleCustomer(10);
		showCustomers(data);
		
		
		System.out.println("\t\t\tRealization getAll()\n====================================================");
		RealizationDAO realization=new RealizationDAO();
		Customer[] newDataCustomers=realization.getAll();
		showCustomers(newDataCustomers);
		
		System.out.println("\t\t\tRealization getByld(int)\n====================================================");
		System.out.println(realization.getByld(4));
		
		System.out.println("\t\t\tRealization add()\n====================================================");
		Customer randCustom;
		randCustom=new Customer(-1,"Mike", "Food", 4520.12);
		realization.add(randCustom);
		showCustomers(data);
		
		System.out.println("\t\t\tRealization update()\n====================================================");
		randCustom =new Customer(8,"Mike", "Food", 4520.12);
		realization.update(randCustom);
		showCustomers(data);
		
		System.out.println("\t\t\tRealization delete()\n====================================================");
		randCustom =new Customer(8,"Mike", "Food", 4520.12);
		realization.delete(randCustom);
		showCustomers(data);
		
		
		System.out.println("\nEND");
		
	}

	static Customer[] generateSampleCustomer(int size) {
		data = new Customer[size];
		for (int i = 0; i < data.length; i++) {
			data[i] = new Customer();
			data[i].setUid(i);
			data[i].setName(names[(int) (Math.random() * names.length)]);
			data[i].setCategory(categoryes[(int) (Math.random() * categoryes.length)]);
			data[i].setCash(2000 + ((int) ((Math.random() * 4000) * 100)) / 100.0);
		}
		maxUid = size-1;
		return data;
	}

	static void showCustomers(Customer[] data) {
		if(data!=null) {
			for (Customer customer : data) {
				System.out.println(customer);
			}
			System.out.println("============================================================================");
		}else {
			System.out.println("DATA IS NULL");
		}
	}

}
