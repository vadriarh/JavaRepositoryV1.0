package model;

public class Bathroom_Sink extends Bath_Shower {
	static int bathroom_sinks = 0;

	private String volume_washbasin;
	private boolean heat;
	private int power;// watt
	private int time_heat;// minutes
	private int voltage;

	public Bathroom_Sink() {
		super();
		bathroom_sinks++;
	}
}
