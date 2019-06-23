package com.test;

import static com.test.ConstantData.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Class for testing <strong>single</strong> thread on the functional
 * performance
 * 
 * @since 2012
 *
 */
public class PerformanceAnalyzer {
	// static final Logger log = Logger.getLogger(PerformanceAnalyzer.class);

	private static PerformanceAnalyzer instance = null;
	private static StringBuffer sb = null;
	private static Timestamp startDate = null;
	private static Timestamp endDate = null;
	private static String msg = "";
	private static boolean isActive = false; // to regulate via settings files or DB

	static {
		isActive = Boolean.TRUE; // TODO
		// isActive =
		// Boolean.parseBoolean(AppSettings.getSettings().getPropValue("PAFlag"));
	}

	private PerformanceAnalyzer(int capacity) {
		startDate = new Timestamp(new Date().getTime());
		// Constructs a new StringBuffer using the specified capacity based on incoming
		// Strings. To avoid INITIAL_SIZE.
		sb = new StringBuffer(capacity + APP_LABEL.length() + startDate.toString().length() + STARTING_LABEL.length()
				+ NEW_LINE_STR.length());
	}

	/**
	 * 
	 * @param pointMsg - to store original root point message/method name :
	 *                 .getClass().getEnclosingMethod().getName()
	 */
	public static synchronized void start(String pointMsg) {
		if (!isActive)
			return;
		if (instance == null)
			instance = new PerformanceAnalyzer(pointMsg.length());

		System.out.println(sb.append(APP_LABEL).append(STARTING_LABEL).append(pointMsg != null ? pointMsg : "")
				.append(startDate).append(". Thread [{").append(Thread.currentThread().getId()).append("} ")
				.append(Thread.currentThread().getName()).append("]").append(NEW_LINE_STR).toString());
		PerformanceAnalyzer.msg = pointMsg;
		sb.setLength(0);
	}

	public static synchronized void end(String msg) {
		if (!isActive)
			return;
		PerformanceAnalyzer.msg = msg; // to override original MSG if needed
		end();
	}

	public static synchronized void end() {
		if (!isActive)
			return;
		if (instance != null && startDate != null) {
			endDate = new Timestamp(new Date().getTime());
			long sec = TimeUnit.MILLISECONDS.toSeconds(endDate.getTime() - startDate.getTime());
			long min = TimeUnit.MILLISECONDS.toMinutes(endDate.getTime() - startDate.getTime());
			sb.ensureCapacity(
					msg.length() + APP_LABEL.length() + endDate.toString().length() + COMPLETING_LABEL.length());
			System.out.println(sb.append(APP_LABEL).append(COMPLETING_LABEL).append(msg).append(endDate)
					.append(". It took : ").append(min).append(" min. ").append(sec % 60).append(" sec.")
					.append(". Thread [{").append(Thread.currentThread().getId()).append("} ")
					.append(Thread.currentThread().getName()).append("] ").append(NEW_LINE_STR).toString());
			sb.setLength(0);
			instance = null;
		} else {
			System.out.println(APP_LABEL + ORDER_HAS_BEEN_BROKEN);
		}
	}

	/**
	 * @return the startDate
	 */
	public static Timestamp getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public static void setStartDate(Timestamp startDate) {
		PerformanceAnalyzer.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public static Timestamp getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public static void setEndDate(Timestamp endDate) {
		PerformanceAnalyzer.endDate = endDate;
	}

	/**
	 * @return the msg
	 */
	public static String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public static void setMsg(String msg) {
		PerformanceAnalyzer.msg = msg;
	}

	/**
	 * @return the instance
	 */
	public static PerformanceAnalyzer getInstance() {
		return instance;
	}

	public static void main(String[] args) {

		start("TEST THIS STUFF ");
		try {
			Thread.sleep(2000); // some job
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end();

	}
}