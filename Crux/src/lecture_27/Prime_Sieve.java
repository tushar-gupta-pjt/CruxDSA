package lecture_27;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=97;
		PrintPrime(97);

	}
	
	public static void PrintPrime(int n) {
		boolean [] prime = new boolean[n+1];
		prime[0]=true;
		prime[1]=true;
		
		for(int i=2;i*i<=prime.length;i++) {
			if(prime[i]==false) {
				for(int j=2;i*j<prime.length;j++) {                        //table chalane ki technique;
					prime[i*j]=true;
				}
			}
		}
		
		for(int i=0;i<prime.length;i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
		}
	}

}
