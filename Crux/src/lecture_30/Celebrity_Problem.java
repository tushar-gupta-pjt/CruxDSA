package lecture_30;

import java.util.Stack;

public class Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int Celebrity(int[][]arr) {
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			st.push(i);
		}
		
		int a=st.pop();
		int b=st.pop();
		
		if(arr[a][b]==1) {
			st.push(b);
		}
		else {
			st.push(a);
		}
		
		int candidate=st.pop();
		
		for(int i=0;i<arr.length;i++) {
			if(i== candidate) {
				continue;
			}
			if(arr[candidate][i]==1 || arr[i][candidate]==0) {          //checking row and column
				return -1;
			}
		}
		return candidate;
	}

}
