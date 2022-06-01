import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Countss:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Countss:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Countss:" + counter.getCount());
		
	}

}
