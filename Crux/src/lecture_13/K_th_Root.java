package lecture_13;

public class K_th_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=149;
		System.out.println(kthroot(n,k));

	}

	public static int kthroot(int n, int k) {
		// TODO Auto-generated method stub
		int start=1;
		int end=n;
		int ans=0;
		while(start<=end) {
			int mid=(start+end)/2;
			if(Math.pow(mid, k)<=n) {
				ans=mid;
				start=mid+1;
				
			}
			else {
				end=mid-1;
			}
		}
		return ans;
	}

}
