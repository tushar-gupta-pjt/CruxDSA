package lecture_7;

public class loop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,9,6,4,9,8,11,45,-9,1};
		System.out.println(search(arr,11));
		System.out.println(maximum(arr));
	}
	
	public static int search(int[]arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}
	
//	public static int maximum(int[]arr) {
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max)max=arr[i];
//		}
//		return max;
//	}
	public static int maximum(int[]arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}
}
