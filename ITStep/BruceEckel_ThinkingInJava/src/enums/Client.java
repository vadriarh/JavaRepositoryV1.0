package enums;

public class Client {

	public static void main(String[] args) {
		//TASK 1--------------------------------------

		for (Money m : Money.values()) {
			System.out.println(m+" "+m.ordinal());
			switch(m) {
			case USD:
				System.out.println("US Dollar");
				break;
			case EUR:
				System.out.println("Euro");
				break;
			case RUB:
				System.out.println("Russian Ruble ");
				break;
			case BYN:
				System.out.println("Belarussian Ruble ");
				break;
			case CAD:
				System.out.println("Canadian Dollar ");
				break;
			case JPY:
				System.out.println("Yen ");
				break;
			}
			System.out.println();
		}
		
		//*******************************************
		
	}

}
