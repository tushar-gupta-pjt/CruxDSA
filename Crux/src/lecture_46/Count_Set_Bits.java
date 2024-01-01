package lecture_46;

public class Count_Set_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =107;
		System.out.println(countSetbit(n));
		System.out.println(countSetbitFast(n));
	}
	
	static int countSetbit(int n) {
		int c=0;
		while(n!=0) {
			if((n&1)!=0) {
				c++;
			}
			n>>=1;
		}
		return c;
		
	}
	static int countSetbitFast(int n) {
		
		int c=0;
		while(n!=0) {
			n=n&(n-1);
			c++;
		}
		return c;
		
		
	}

}
