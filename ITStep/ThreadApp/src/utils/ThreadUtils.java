package utils;

public class ThreadUtils {
	public static void begin(Thread th) {
		System.out.println("Started: " + th);
	}

	public static void end(Thread th) {
		System.out.println("Finished: " + th);
	}
	
	public static void job(Thread th) {
		for (int i = 0; i < (int)(Math.random()*10); i++) {
			try {
				Thread.sleep(100*(int)(Math.random()*10));
				System.out.println("JOB: "+th);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
