package threads;

public class MyThread3 implements Runnable{
	private static MyThread3 instance=new MyThread3();
	private boolean isRunning=true;
	
	public void disable() {
		isRunning=false;
	}

	private MyThread3() {
		new Thread(this,"Crazy Child Thread").start();
	}
	
	public static MyThread3 getInstance() {
		return instance;
	}
	
	
	@Override
	public void run() {
		System.out.println("Start:"+Thread.currentThread());
		while(true) {
			try {
				if(!isRunning) break;
				Thread.sleep(500);
				System.out.println("Crazy Child Job");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Finish:"+Thread.currentThread());
	}

	
}
