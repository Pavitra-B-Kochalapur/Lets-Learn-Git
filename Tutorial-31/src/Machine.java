
public abstract class  Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public abstract void run();
	public abstract void dostuff();
	
	public void view() {
		run();
	}
	

}
