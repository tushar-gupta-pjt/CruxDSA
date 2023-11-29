package lecture_29;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.peek();
		s.push(10);
		s.push(20);
		s.push(0);
		s.push(-3);
		s.push(8);
		s.display();
		s.push(9);

	}

}
