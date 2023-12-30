package lecture_45;


//SLIDING WINDOW
public class Maximun_Sum_of_SubArray_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {2,3,1,1,7,9,6,5,4,3,2};
		int k =3;
		System.out.println(Maximum_Sum(arr,k));

	}

	private static int Maximum_Sum(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int sum=0, ans=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		ans=sum;
		for(int i =k;i<arr.length;i++) {
			//Grow
			sum+=arr[i];
			//Shrink
			sum=sum-arr[i-k];
			//Update answer
			ans=Math.max(sum,ans);
		}
		return ans;
	}
	
	

}
