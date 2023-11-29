package lecture_11;

public class Inseretion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,3,4,2,7,9,3};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			InsertElement(arr,i);
		}
		
	}

	public static void InsertElement(int[] arr, int i) {
		// TODO Auto-generated method stub
		int j=i-1;
		int item=arr[i];
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			arr[j]=item;
			j--;
		}
		
	}

}
