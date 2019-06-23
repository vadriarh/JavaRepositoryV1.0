package enums.homework;

public class Client {

	public static void main(String[] args) {
		for (TrafficSignal ts : TrafficSignal.values()) {
			System.out.println("(Command #"+ts.alert()+")");
			System.out.println();
		}
	}
}

enum TrafficSignal {
	RED {
		@Override
		public int alert() {
			System.out.println("You Stop Now");
			return 0;

		}
	},
	YELLOW {
		@Override
		public int alert() {
			System.out.println("Ready");
			return 1;

		}
	},
	GREEN {
		@Override
		public int alert() {
			System.out.println("You Can Go Now");
			return 2;

		}
	};
	int commandNumber;
	public abstract int alert();
}
