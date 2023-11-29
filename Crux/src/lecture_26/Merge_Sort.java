package lecture_26;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,3,1,4,2};
		int n=arr.length;
	
		int[]ans=new int[n];
		
		ans=Sort(arr,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
		

	}
	
	public static int[] Sort(int[]arr, int si, int ei) {
		
		if(si==ei) {
			int[]bs =new int[1];
			bs[0]=arr[si];
			return bs;
		}
		
		int mid=(si+ei)/2;
		int[]fs=Sort(arr,si,mid);
		int[] ss=Sort(arr,mid+1,ei);
		
		return Merge(fs,ss);
	}
	
	public static int[] Merge(int[]arr1,int[]arr2) {
		int n=arr1.length;
		int m=arr2.length;
		
		int[]ans=new int[n+m];
		int i=0, j=0, k=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			} else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			k++;
			j++;
		}
		return ans;
	}

}
