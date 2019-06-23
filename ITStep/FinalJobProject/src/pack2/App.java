package pack2;



public class App {
	static int maxUid = 0;
	static Customer[] data;
	private static String[] names = { "Авдей", "Аверкий", "Авксентий", "Агафон", "Александр", "Алексей", "Альберт",
			"Альвиан", "Анатолий", "Андрей", "Антон", "Антонин", "Анфим", "Аристарх", "Аркадий", "Арсений", "Артём ",
			"Артур", "Архипп", "Афанасий", "Богдан", "Борис", "фВадим", "Валентин", "Валерий", "Валерьян", "Варлам",
			"Варфоломей ", "Василий", "Венедикт", "Вениамин ", "Викентий ", "Виктор ", "Виссарион", "Виталий",
			"Владимир ", "Владислав", "Владлен", "Влас", "Всеволод", "Вячеслав", "Гавриил", "Галактион", "Геласий",
			"Геннадий", "Георгий", "Герасим", "Герман", "Глеб", "Гордей", "Григорий", "Даниил ", "Демид ", "Демьян",
			"Денис", "Дмитрий", "Добрыня", "Донат", "Дорофей", "Евгений", "Евграф", "Евдоким", "Евсей", "Евстафий",
			"Егор", "Емельян", "Еремей", "Ермолай", "Ефим", "Ждан", "Зиновий", "Иакинф", "Иван", "Игнатий", "Игорь",
			"Илья", "Иннокентий", "Ираклий ", "Ириней", "Исидор", "Иулиан", "Ким ", "Кирилл ", "Климент", "Кондрат ",
			"Константин", "Корнилий", "Кузьма", "Куприян", "Лаврентий", "Лев ", "Леонид", "Леонтий", "Лука ", "Лукий",
			"Лукьян", "Магистриан", "Макар", "Максим", "Марк ", "Мартын", "Матвей", "Мелентий", "Мирон", "Мирослав ",
			"Митрофан", "Михаил", "Мстислав", "Назар ", "Нестор", "Никанор", "Никита", "Никифор", "Николай", "Никон",
			"Олег", "Онисим", "Павел", "Пантелеймон", "Парфений", "Пётр", "Платон ", "Порфирий", "Потап", "Пров",
			"Прокопий", "Протасий", "Прохор", "Разумник", "Родион", "Роман ", "Ростислав", "Руслан", "Савва", "Савелий",
			"Самуил ", "Святополк", "Святослав", "Севастьян", "Семён", "Сергей", "Сильвестр", "Сильвестр ", "Созон",
			"Спиридон", "Станислав", "Степан", "Тарас", "Тимофей", "Тимур", "Тихон", "Тихон ", "Трифон", "Трофим",
			"Фаддей", "Фёдор", "Федосей", "Федот", "Феликс", "Феоктист", "Филат", "Филипп", "Фома", "Харитон",
			"Христофор", "Эдуард", "Эраст", "лиан", "Юрий", "Юстин", "Яков", "Якун", "Ярослав" };
	private static String[] categoryes = { "Еда", "Химия", "Одежда", "Мебель", "Пресса", "Медицина", "Электроника" };

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
