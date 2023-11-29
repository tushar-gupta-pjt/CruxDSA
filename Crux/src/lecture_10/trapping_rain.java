package lecture_10;

public class trapping_rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(rainsum(arr));

	}
	public static int rainsum(int[]arr) {
		
		//for left max
		int n=arr.length;
		int[]leftmax=new int[n];
		leftmax[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			leftmax[i]=Math.max(arr[i], leftmax[i-1]);
		}
		//for right max
		
		int[]rightmax=new int[n];
		rightmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(arr[i], rightmax[i+1]);
		}
		
		//for calculating water
		
		int water=0;
		for(int i=0;i<arr.length;i++) {
			water+=Math.min(leftmax[i], rightmax[i])-arr[i];
		}
		return water;
	}

}
