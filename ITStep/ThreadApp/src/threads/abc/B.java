package threads.abc;

import utils.ThreadUtils;

public class B extends Thread{
	private Thread thToJoin;
	public void setThToJoin(Thread thToJoin) {
		if(this.thToJoin != thToJoin) {
			this.thToJoin = thToJoin;
		}
		
	}
	public B() {
		setName("B");
	}
	
	@Override
	public void run() {
		ThreadUtils.begin(this);
		ThreadUtils.job(this);
		if(thToJoin!=null) {
			try {
				thToJoin.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ThreadUtils.end(this);
	}
}
