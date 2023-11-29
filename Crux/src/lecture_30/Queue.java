package lecture_30;


public class Queue {                                            //first in first out(FIFO)
	protected int[]arr;
	
	protected int front =0;
	
	private int size=0;
	
	public Queue() {
		arr=new int[5];
	}
	
	public Queue(int n) {
		arr=new int[n];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public void Enqueue(int item) throws Exception {
		
		if(isFull()) {
			throw new Exception ("Queue is already full");
		}
		int idx = (front + size)%arr.length; //(this mod makes it circular queue )                            //check by dry running it
		arr[idx]=item;
		size++;
	}
	public int Dequeue() throws Exception {
		
		if(isEmpty()) {
			throw new Exception ("Queue is already Empty");
		}
		int rv = arr[front];
		front=(front+1)%arr.length;    //(this mod makes it circular queue )  
		size--;
		return rv;
		
	}
	public int size() {
		return size;
	}
	
	public int getFront()throws Exception {
		if(isEmpty()) {
			throw new Exception ("Queue is already Empty");
		}
		int rv=arr[front];
		return rv;
	}
	
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx= (front + i )%arr.length;
			System.out.print(arr[idx]+" ");
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.Enqueue(50);
		q.Enqueue(60);
		q.Display();
		

	}

	
	
	

}
