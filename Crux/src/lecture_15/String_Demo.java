package lecture_15;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s1==s3);
		System.out.println(s4==s3);
		System.out.println(s1==s2);
		System.out.println(s1.length());

	}

}
