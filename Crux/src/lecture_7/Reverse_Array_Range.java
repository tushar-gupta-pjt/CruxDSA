package lecture_7;

public class Reverse_Array_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,3,4,6,7,9,11,2,3,4,5,56,12};
		Reverse(arr,2,7);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void Reverse(int[] arr,int i,int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
	}

}
