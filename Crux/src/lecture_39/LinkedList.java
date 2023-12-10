package lecture_39;


public class LinkedList<T> {
	
	public class Node{
		T data;
		Node next;
		
		
		public Node(T data) {
			this.data=data;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public void AddFirst(T item) {
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
	
	public void AddLast(T item) {
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
	public T getfirst() throws Exception {
		if(this.head==null) {
			throw new Exception("LinkedList is Empty");
		}
		else {
			return this.head.data;
		}
	}
	public T getLast() throws Exception {
		if(this.head==null) {
			throw new Exception("LinkedList is Empty");
		}
		else {
			return this.tail.data;
		}
	}
	
	private Node getNode(int k ) throws Exception {
		
		if(k<0 || k>=this.size) {
			throw new Exception("given index is out of bounds");
		}
		else {
			Node temp=this.head;
			for(int i=1;i<=k;i++) {
				temp=temp.next;
			}
			return temp;
			
		}
		
	}
	public T getAtIndex(int k) throws Exception {
		return getNode(k).data;
	}
	
	public T removefirst() {
		Node temp = this.head;
		this.head=this.head.next;
		temp.next=null;
		this.size--;
		return temp.data;
	}
	
	public T removeLast() throws Exception {
		if(this.size==1) {
			return removefirst();
		}
		else {
			Node temp=getNode(this.size-2);
			T rv=this.tail.data;
			this.tail=temp;
			this.tail.next=null;
			this.size--;
			return rv;
		}
	}
	public T removeAtindex(int k) throws Exception{
		
		if(k<0 || k>=this.size) {
			throw new Exception("given index is out of bounds");
		}
		else if(k==0) {
			return removefirst();
		}
		else if(k==this.size-1){
			return removeLast();
		}
		else {
			Node kth = getNode(k);
			Node k_1th= getNode(k-1);
			k_1th.next=kth.next;
			kth.next=null;
			this.size--;
			return kth.data;
			
		}
		
	}
	public void addAtindex(T item , int k) throws Exception {
		
		if(k<0 || k>=this.size) {
			throw new Exception("given index is out of bounds");
		}
		else if(k==0) {
			AddFirst(item);
		}
		else if(k==this.size) {
			AddLast(item);
		}
		else {
			Node nn = new Node(item);
			Node k_1th= getNode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			this.size++;
			
			
		}
		
	}

}

