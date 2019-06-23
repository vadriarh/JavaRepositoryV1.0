package glava14;

import java.io.*;


public class DungeonGame implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int x=3;
	transient long y=4;
	private short z=5;
	
	public int getX() {
		return x;
	}
	public long getY() {
		return y;
	}
	public short getZ() {
		return z;
	}
	
	

}
