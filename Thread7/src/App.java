import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

     /*
     *Producer-Consumer pattern in Java using the {@link java.util.concurrent
	 * .ArrayBlockingQueue} Java class.
	 * <br><br>
	 * Producer-Consumer is the situation where one or more threads are producing
	 * data items and adding them to a shared data store of some kind while one or
	 * more other threads process those items, removing them from the data store.
     */
public class App {
	
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {}		
			}			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {}
			}		
		});
		
		t1.start();
		t2.start();
		
//		t1.join();
//		t2.join();
		
		// Pause for 30 seconds and force quitting the app (because we're
        // looping infinitely)
		Thread.sleep(30000);
		System.exit(0);
	}
	
	private static void producer() throws InterruptedException {
		Random random = new Random();
		while(true) {//loop indefinitely
			queue.put(random.nextInt(100));//if queue is full (10) waits			
		}
	}
	
	private static void consumer() throws InterruptedException {
		Random random = new Random();
		while(true) {
			Thread.sleep(100);
			if(random.nextInt(10) == 0) {
				Integer value = queue.take();//if queue is empty waits
				System.out.println("Taken value: " + value + "; Queue size is: " + queue.size());
			}
		}
	}

}
