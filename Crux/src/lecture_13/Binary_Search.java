package lecture_13;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,5,7,8,9,11,13};
		int item=11;
		System.out.println(Search(arr,item));

	}

	public static int Search(int[] arr, int item) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(arr[mid]==item)return mid;
			else if(arr[mid]>item)end=mid-1;
			else start=mid+1;
		}
		return -1;
	}

}
