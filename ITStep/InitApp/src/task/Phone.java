package task;

public class Phone extends Product {
	String model;
	String protect = "No protect";
	double cost;
	double displaySize;
	String displayType;
	String operationSystem;
	String operationSystemVersion;

	String coverToTag() {
		return null;
	}

	@Override
	public String toString() {
		String message = "Phone: " + brand + " " + model + ".\nColor: " + color + ".\nWeight: " + weight
				+ ".\nProtect:  " + protect + ".\nDisplay: " + displaySize + " (" + displayType
				+ ").\nOperation system: " + operationSystem + " " + operationSystemVersion;
		return message;
	}
}
