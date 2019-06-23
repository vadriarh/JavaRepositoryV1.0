package model;

public class Shower_System extends Bath_Shower {
	static int shower_systems = 0;
	private String mixer_type;

	public Shower_System() {
		super();
		shower_systems++;
	}
}
