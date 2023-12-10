package lecture_39;

public interface QueueI {
	
	public void Enqueue(int i);
	
	
	public int Dequeue();
	
	public int getfront();
	
	public static final int x =90;
	
	// java 8
	
	static void fun() {
		
	}
	default void f1() {
		
	}
	
	// java 9
	private int f2() {
		return 0;
	}

}
