package lecture_18;

public class Tail_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		System.out.println(pow(a,b,1));

	}
	
	public static int pow(int a, int b, int ans) {
		if(b==0)return ans;
		return pow(a,b-1,ans*a);
	}

}
