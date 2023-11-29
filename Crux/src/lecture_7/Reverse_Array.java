package lecture_7;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,3,4,6,7,9};
		Reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Reverse(int[]arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j && i<arr.length-1) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static void swap(int[]arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
