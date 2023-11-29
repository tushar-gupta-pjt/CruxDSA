package lecture_15;

public class Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Print(arr);
	}
	public static void Print(int[][]arr) {
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		while(minr<=maxr && minc<=maxc) {
		  for(int i=minc;i<=maxc;i++) {
			  System.out.print(arr[minr][i]+" ");
		  }
		  minr++;
		  for(int i=minr;i<=maxr;i++) {
			  System.out.print(arr[i][maxc]+" ");
		  }
		  maxc--;
		  for(int i=maxc;i>=minc;i--) {
			  System.out.print(arr[maxr][i]+" ");
		  }
		  maxr--;
		  for(int i=maxr;i>=minr;i--) {
			  System.out.print(arr[i][minc]+" ");
		  }
		  minc++;
	    }
	}
}
