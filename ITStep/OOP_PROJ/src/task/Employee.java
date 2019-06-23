package task;

class Util {

	static String names[] = { "Авдей", "Аверкий", "Авксентий", "Агафон", "Александр", "Алексей", "Альберт", "Альвиан",
			"Анатолий", "Андрей", "Антон", "Антонин", "Анфим", "Аристарх", "Аркадий", "Арсений", "Артём ", "Артур",
			"Архипп", "Афанасий", "Богдан", "Борис", "фВадим", "Валентин", "Валерий", "Валерьян", "Варлам",
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
	static String lastNames[] = { "Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Лебедев", "Козлов", "Новиков",
			"Морозов", "Петров", "Волков", "Соловьёв", "Васильев", "Зайцев", "Павлов", "Семёнов", "Голубев",
			"Виноградов", "Богданов", "Воробьёв", "Фёдоров", "Михайлов", "Беляев", "Тарасов", "Белов", "Комаров",
			"Орлов", "Киселёв", "Макаров", "Андреев", "Ковалёв", "Ильин", "Гусев", "Титов", "Кузьмин", "Кудрявцев",
			"Баранов", "Куликов", "Алексеев", "Степанов", "Яковлев", "Сорокин", "Сергеев", "Романов", "Захаров",
			"Борисов", "Королёв", "Герасимов", "Пономарёв", "Григорьев", "Лазарев", "Медведев", "Ершов", "Никитин",
			"Соболев", "Рябов", "Поляков", "Цветков", "Данилов", "Жуков", "Фролов", "Журавлёв", "Николаев", "Крылов",
			"Максимов", "Сидоров", "Осипов", "Белоусов", "Федотов", "Дорофеев", "Егоров", "Матвеев", "Бобров",
			"Дмитриев", "Калинин", "Анисимов", "Петухов", "Антонов", "Тимофеев", "Никифоров", "Веселов", "Филиппов",
			"Марков", "Большаков", "Суханов", "Миронов", "Ширяев", "Александров", "Коновалов", "Шестаков", "Казаков",
			"Ефимов", "Денисов", "Громов", "Фомин", "Давыдов", "Мельников", "Щербаков", "Блинов", "Колесников",
			"Карпов", "Афанасьев", "Власов", "Маслов", "Исаков", "Тихонов", "Аксёнов", "Гаврилов", "Родионов", "Котов",
			"Горбунов", "Кудряшов", "Быков", "Зуев", "Третьяков", "Савельев", "Панов", "Рыбаков", "Суворов", "Абрамов",
			"Воронов", "Мухин", "Архипов", "Трофимов", "Мартынов", "Емельянов", "Горшков", "Чернов", "Овчинников",
			"Селезнёв", "Панфилов", "Копылов", "Михеев", "Галкин", "Назаров", "Лобанов", "Лукин", "Беляков", "Потапов",
			"Некрасов", "Хохлов", "Жданов", "Наумов", "Шилов", "Воронцов", "Ермаков", "Дроздов", "Игнатьев", "Савин",
			"Логинов", "Сафонов", "Капустин", "Кириллов", "Моисеев", "Елисеев", "Кошелев", "Костин", "Горбачёв",
			"Орехов", "Ефремов", "Исаев", "Евдокимов", "Калашников", "Кабанов", "Носков", "Юдин", "Кулагин", "Лапин",
			"Прохоров", "Нестеров", "Харитонов", "Агафонов", "Муравьёв", "Ларионов", "Федосеев", "Зимин", "Пахомов",
			"Шубин", "Игнатов", "Филатов", "Крюков", "Рогов", "Кулаков", "Терентьев", "Молчанов", "Владимиров",
			"Артемьев", "Гурьев", "Зиновьев", "Гришин", "Кононов", "Дементьев", "Ситников", "Симонов", "Мишин",
			"Фадеев", "Комиссаров", "Мамонтов", "Носов", "Гуляев", "Шаров", "Устинов", "Вишняков", "Евсеев",
			"Лаврентьев", "Брагин", "Константинов", "Корнилов", "Авдеев", "Зыков", "Бирюков", "Шарапов", "Никонов",
			"Щукин", "Дьячков", "Одинцов", "Сазонов", "Якушев", "Красильников", "Гордеев", "Самойлов", "Князев",
			"Беспалов", "Уваров", "Шашков", "Бобылёв", "Доронин", "Белозёров", "Рожков", "Самсонов", "Мясников",
			"Лихачёв", "Буров", "Сысоев", "Фомичёв", "Русаков", "Стрелков", "Гущин", "Тетерин", "Колобов", "Субботин",
			"Фокин", "Блохин", "Селиверстов", "Пестов", "Кондратьев", "Силин", "Меркушев", "Лыткин", "Туров" };
	static String companyNames[] = { "Google", "Yahoo!", "IBM", "SAP" };
	static String jobPositions[] = { "Tester", "Developer", "Manager" };

	public static Employee[] generateEmployees(int num) {
		Employee employees[] = new Employee[num];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = generateEmployee();
//			employees[i].setUid(i + 1);
		}
		return employees;
	}

	public static Employee[][] sortingToCompany(Employee arrInput[]) {
		Employee arrResult[][] = new Employee[arrInput.length][companyNames.length];
		for (int i = 0; i < companyNames.length; i++) {
			for (int k = 0; k < arrResult.length; k++) {
				if (arrInput[k].getCompanyName() == companyNames[i]) {
					arrResult[k][i] = arrInput[k];
				}
			}
		}
		return arrResult;
	}

	public static Employee generateEmployee() {
		Employee empl = new Employee();

		empl.setName(names[(int) (Math.random() * names.length)]);
		empl.setLastName(lastNames[(int) (Math.random() * lastNames.length)]);
		empl.setCompanyName(companyNames[(int) (Math.random() * companyNames.length)]);
		empl.setJobPosition(jobPositions[(int) (Math.random() * jobPositions.length)]);
		empl.setAge((int) (18 + Math.random() * (61 - 18)));
		empl.setSalary(1000 + Math.random() * 4000);
		return empl;
	}

	public static void printInfoForEmployee(Employee employee) {
		System.out.println(employee.getName() + " " + employee.getLastName());
		System.out.println("Age = " + employee.getAge());
		// System.out.println(employee.getCompanyName());
		System.out.println(employee.getJobPosition() + ": " + employee.getSalary());
		System.out.println();
	}

	public static void printEmployeeForCompanies(Employee arrInput[][], String companyNames[]) {
		int count = 1;
		for (int i = 0; i < companyNames.length; i++) {
			System.out.println(companyNames[i] + ": ");
			for (int k = 0; k < arrInput.length; k++) {
				if (arrInput[k][i] != null) {
					System.out.print(count + ". ");
					printInfoForEmployee(arrInput[k][i]);
					count++;
				}
			}
			System.out.println("====================");
			count = 1;

		}
	}
}

public class Employee {

	private int age;
	private String name;
	private String lastName;
	private String jobPosition;
	private String companyName;
	private double salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Invalid AGE for Employee!" + age);
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int age, String name, String lastName, String jobPosition, String companyName, double salary) {
		this();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.jobPosition = jobPosition;
		this.companyName = companyName;
		this.salary = salary;

	}

	public Employee() {
	}

//	public long getUid() {
//		return uid;
//	}
//
//	public void setUid(long uid) {
//		this.uid = uid;
//	}

}

class Tester {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setAge(30);
		em1.setName("Alex");
		em1.setJobPosition("Developer");
		em1.setCompanyName("EPAM");
		em1.setLastName("Ivanov");
		em1.setSalary(5000);

		em1.setJobPosition("Senior");

		Employee em2 = new Employee();
		em2.setAge(45);
		em2.setName("Glen");
		em2.setJobPosition("Vice-president");
		em2.setCompanyName("IBM");
		em2.setLastName("Sinder");
		em2.setSalary(23500);
		// Employee em3 = new Employee(25, "World", "of", "Warcraft", "Gamer", 4200);

		// Employee em4 = Util.generateEmployee();

		// Employee emplForCompanies[]=new Employee[]
		Util.printEmployeeForCompanies(Util.sortingToCompany(Util.generateEmployees(100)), Util.companyNames);

	}
}
