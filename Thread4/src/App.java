
public class App {
	public static void main(String[] args) {
		System.out.println("Synchronized Methods");
		WorkerMethodsSynchronized workerMethods = new WorkerMethodsSynchronized();
		workerMethods.main();
		
		System.out.println("Synchronized Objects");
		Worker worker = new Worker();
		worker.main();
	}

}
