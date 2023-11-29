package lecture_20;

public class Coin_Toss_Count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
//		Toss_count(n,"");
		System.out.println(Toss_count(n,""));

	}
	public static int Toss_count(int n, String ans) {
		
		if(n==0) {
//			System.out.print(ans+" ");
			
			return 1;
		}
		
		int a=Toss_count(n-1,ans+"H");
		int b=Toss_count(n-1,ans+"T");
		return a+b;
	}


}
