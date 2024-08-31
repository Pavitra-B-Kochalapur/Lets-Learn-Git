import java.util.logging.Level;
import java.util.logging.Logger;
//synchronized : "only let one thread in here at a time".
//code join : "wait until thread on which join has called finished.

public class App {
	private int count = 0;
	
	public static void main(String[] args) {
		App app = new App();
		app.doWork();
		
	}
	
	 /**
     * Run code again by removing the synchronized and join keywords By removing
     * synchronized keyword count variable will vary that is it is not atomic in
     * this case due to the reason that count is shared between the threads or
     * without join keyword count will output wrong.
     */
	public synchronized void increment(String threadName) throws InterruptedException {
		count++;
		//Thread.sleep(1000);
		System.out.println("Thread in progress: " + threadName + " and count is: " + count);
	}
	
	public void doWork() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					try {
						increment(Thread.currentThread().getName());
					} catch (InterruptedException e) {
						Logger.getLogger(App.class.getName()).log(Level.SEVERE, null,e);
					}
					
				}
				
			}
			
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					try {
						increment(Thread.currentThread().getName());
					} catch (InterruptedException e) {
						Logger.getLogger(App.class.getName()).log(Level.SEVERE, null,e);
					}
					
				}
				
			}
			
		});
		thread2.start();
		
		/**
         * Join Threads: Finish until thread finishes execution, then progress
         * the code Reminder: your method is also a thread so without joining
         * threads System.out.println("Count is: " + count); will work
         * immediately. Join does not terminate Thread 2, just progress of the
         * code stops until Threads terminate.
         */
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count is: " + count);
	}
}
