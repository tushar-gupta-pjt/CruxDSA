package lecture_11;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,3,4,2,1};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
	}

}
