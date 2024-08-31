
public class App {
	public static void main(String[] args) throws InterruptedException {
		final Processor processor = new Processor();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.produce();
				} catch (InterruptedException e) {}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.consume();
				} catch (InterruptedException e) {}
			}
			
		});
		
		t1.start();
		t2.start();
		
//		t1.join();
//		t2.join();
		
		//Pause for 30 seconds and force quitting the app (we are loopig infinitely)
		Thread.sleep(30000);
		System.exit(0);
	}

}
