package lecture_14;

public class Transpose_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,4,7,1,5},
				     {2,5,8,2,9},
				     {3,6,9,1,2},
				     {1,3,5,8,2},
				     {1,2,3,6,3}};
		Transpose(arr,5);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static void Transpose(int[][]arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
