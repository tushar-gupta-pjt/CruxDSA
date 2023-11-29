package lecture_20;

public class Coin_Toss_Count {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Toss(n,"");
		System.out.println(count);

	}
	public static void Toss(int n, String ans) {
			
			if(n==0) {
				System.out.print(ans+" ");
				count++;
				return;
			}
			
			Toss(n-1,ans+"H");
			Toss(n-1,ans+"T");
		}

}
