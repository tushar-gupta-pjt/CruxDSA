package lecture_29;

public class Stack {
	
	protected int [] arr;
	
	private int idx=-1;

	public Stack() {
		arr= new int[5];
	}
	
	public Stack(int n) {
		arr= new int[n];
	}
	
	
	//O(1) time complexity
	public boolean isEmpty() {
		return idx==-1;
	}
	
	//O(1) time complexity
	public boolean isFull() {
		return size()==arr.length;
	}
	//O(1) time complexity
	public void push (int item) throws Exception{
		if(isFull()) {
			throw new Exception("Stack Overflowed");
		}
		idx++;
		arr[idx]=item;
	}
	//O(1) time complexity
	public int pop()throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack Underflowed");
		}
		int rv=arr[idx];
		idx--;
		return rv;
	}
	//O(1) time complexity
	public int peek()throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is already Empty");
		}
		int rv=arr[idx];
		return rv;
	}
	
	//O(1) time complexity
	public int size() {
		return idx+1;
	}
	
	public void display() {
		for(int i=0;i<=idx;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	

}
