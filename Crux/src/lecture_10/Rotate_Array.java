package lecture_10;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,6,7};
		Rotate(arr,3);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

	public static void Rotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n=arr.length;
		k=k%n;
		for(int j=1;j<=k;j++) {
			int item=arr[n-1];
			for(int i=n-2;i>=0;i--) {
				arr[i+1]=arr[i];
				}
			arr[0]=item;
			}
		}

}