package lecture_28;

public class Student {
	
	String name;
	int age;
	
	public void Intro_yourself() {
		System.out.println("My name is "+name + " and age is "+ age);
	}
	public void SayHey(String name) {
		System.out.println(this.name+" Say Hello "+ name);
	}
	
	public static void fun(int x) {
		System.out.println("I am in Fun"+ x);
	}
	static {
		System.out.println("I am Static");
	}

}
