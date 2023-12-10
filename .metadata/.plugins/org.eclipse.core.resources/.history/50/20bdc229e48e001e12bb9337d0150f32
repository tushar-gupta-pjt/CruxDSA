package lecture_34;


public class Linked_List_Cycle {

	public class Node{
		int data;
		Node next;
		
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public void AddFirst(int item) {
		Node nn= new Node(item);
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			nn.next=this.head;
			this.head=nn;
			this.size++;
		}
	}
	
	public void Display() {
		Node temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data +"---> ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void AddLast(int item) {
		Node nn = new Node(item);
		
		if(this.size==0) {
			AddFirst(item);
			this.size++;
		}
		else {
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}
	 public void createCycle() {
		 this.tail.next=this.head;  // create circular
	 }
	 
	 
	 public boolean hasCycle() {
		 Node slow =head;
	     Node fast= head;
	     while(fast!=null && fast.next!=null){
	    	 fast=fast.next.next;
	         slow=slow.next;
	         if(slow==fast) {
	        	 return true;
	        	 }
	        }
	        return false;
	 }
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_Cycle cl = new Linked_List_Cycle();
		cl.AddFirst(10);
		cl.AddFirst(22);
		cl.AddFirst(12);
		cl.AddFirst(23);
		cl.AddFirst(123);
		cl.AddFirst(222);
		cl.AddFirst(110);
		cl.Display();
		cl.createCycle();
		System.out.println(cl.hasCycle());
		

	}

}
