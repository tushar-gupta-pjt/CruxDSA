package lecture_33;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.Display();
		ll.AddLast(40);
		ll.Display();
		System.out.println(ll.getfirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getAtIndex(2));
		System.out.println(ll.removefirst());
		ll.Display();
		System.out.println(ll.removeLast());
		ll.Display();
		ll.addAtindex(23, 1);
		ll.addAtindex(323, 2);
		ll.addAtindex(2322, 2);
		ll.Display();
		ll.removeAtindex(1);
		ll.Display();
		
	}

}
