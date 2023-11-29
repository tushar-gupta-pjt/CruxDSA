package lecture_19;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toss(3,"");
	}
	
	public static void Toss(int n, String ans) {
		
		if(n==0) {
			System.out.print(ans+" ");
			return;
		}
		
		Toss(n-1,ans+"H");
		Toss(n-1,ans+"T");
	}

}
