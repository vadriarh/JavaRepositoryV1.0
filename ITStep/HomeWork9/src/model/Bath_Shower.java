package model;

public class Bath_Shower extends Product {
	static int bath_showers = 0;

	private String purpose;
	private String mounting_method;
	private String water_connection_method;

	public Bath_Shower() {
		super();
		bath_showers++;
	}
}
