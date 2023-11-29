package lecture_20;

public class Static_Variable {
	
	static int val=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println(val);
		System.out.println("bye");
		fun();
		System.out.println(val);
	}
	public static void fun() {
     	val=val+5;
	}

}
