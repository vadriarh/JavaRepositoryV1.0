package test;

public class StaticTester {

	static int counter;

	int value;

	public StaticTester() {
		counter++;
		value++;
	}

	@Override
	public String toString() {
		return "VALUE" + value + " / COUNTER " + counter;
	}

}
