package lecture_10;

public class reversal_algo {

	public static void main(String[] args) {
		int[]nums= {1,2,3,4,5,6,7};
		int k=3;
		// TODO Auto-generated method stub
		int n=nums.length;
		k=k%n;
		reverse(nums,0,n-k-1);//reverse n-k elements
		reverse(nums,n-k,n-1);//reverse last k elements
		reverse(nums,0,n-1);//reverse whole array

	}
	public static void reverse(int[]arr,int i, int j){
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
