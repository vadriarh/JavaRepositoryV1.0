package glava10;

import static java.lang.System.out;
import java.util.Calendar;

public class FullMoon {
	static int DAY_IM = 1000 * 60 * 60 * 24;

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2004, 0, 7, 15, 40);
		long day1=c.getTimeInMillis();
		for (int x = 0; x < 60; x++) {
			day1+=(DAY_IM*29.52);
			c.setTimeInMillis(day1);
			out.println(String.format("���������� ���� � %tc", c));
		}
	}

}
