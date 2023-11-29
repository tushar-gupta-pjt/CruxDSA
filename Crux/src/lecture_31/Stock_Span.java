package lecture_31;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {30,35,40,38,35};
		cal_span(arr);
		

	}
	
	public static void cal_span(int[]arr) {
		Stack<Integer> st = new Stack<>();
		
		int [] ans = new int[arr.length];
		
		for(int i=0;i< arr.length; i++) {
			while(!st.empty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				ans[i] = i+1;
			}
			else {
				ans[i] = i -st.peek();
			}
			st.push(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+ans[i]);
		}
	}

}
