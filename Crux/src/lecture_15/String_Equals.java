package lecture_15;

public class String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("byeee");
		System.out.println(equals(s1,s2));
		System.out.println(equals(s1,s3));
		System.out.println(equals(s1,s4));
		System.out.println(equals(s3,s4));

	}
	
	public static boolean equals(String s1,String s2) {
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					return false;
				}
			}
			return true;
			
		}
		else return false;
	}

}
