package lecture_18;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(5));

	}
	public static int fac(int n) {
		
		if(n==1)return 1;
		
		int fn=fac(n-1);
		
		return n*fn;
	}
	

}
