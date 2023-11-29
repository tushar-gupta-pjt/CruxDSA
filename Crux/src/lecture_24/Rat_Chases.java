package lecture_24;
import java.util.*;

public class Rat_Chases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][]arr=new char[n][m];
		for(int i=0;i<arr.length;i++) {
			String s=sc.next();
			for(int j=0;j<s.length();j++) {
				arr[i][j]=s.charAt(j);
			}
		}
		int[][]ans=new int[n][m];
		MazePath(arr,0,0,ans);
		if(val==false) {
			System.out.print("NO PATH FOUND");
		}

	}
	
	
	
	static boolean val=false;

	public static void MazePath(char[][] arr, int i, int j,int[][]ans) {
		// TODO Auto-generated method stub
		if(i==arr.length-1 && j==arr[0].length-1 && arr[i][j]!='X' ) {
			ans[i][j]=1;
			Display(ans);
			val=true;
			return;
		}
		
		if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]=='X') {
			return;
		}
		arr[i][j]='X';
		ans[i][j]=1;
		MazePath(arr,i-1,j, ans); //UP
		MazePath(arr,i+1,j, ans); //DOWN
		MazePath(arr,i,j-1, ans); //LEFT
		MazePath(arr,i,j+1, ans); //RIGHT
		arr[i][j]='O';
		ans[i][j]=0;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
