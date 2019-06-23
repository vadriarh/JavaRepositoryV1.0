package threads.abc;

import utils.ThreadUtils;

public class C extends Thread{
	
	public C() {
		setName("C");
	}
	
	
	@Override
	public void run() {
		ThreadUtils.begin(this);
		ThreadUtils.job(this);
		ThreadUtils.end(this);
	}
}
