package threads;

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Parent thread "+Thread.currentThread().getName()+" "
				+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
		
		
		//
		MyThread3 thread3=MyThread3.getInstance();
		Thread.sleep(5000);
		
		thread3.disable();
		
		
		
		
		
		//наследник класса THREAD
		MyThread thread1=new MyThread();
		thread1.start();
		Thread.sleep(500);
		
		//Оборачиваем интерфейсный метод в тип Thread через Thread(Runnable target)
		Thread thread2=new Thread(new MyThread2(),"CHILD2");
		thread2.start();
		//
		
		thread2.join();//присоединение к child2-потоку
		System.out.println("Parent thread is finished");
	}

}
