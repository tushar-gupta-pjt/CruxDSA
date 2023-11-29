package lecture_32;

import lecture_29.Stack;
public class DynamicStack extends Stack {
	
	
	@Override
	public void push(int item) throws Exception {
		if(super.isFull()) {
			int[] ar = new int[2 * arr.length];
			
			for(int i=0;i<arr.length;i++) {
				ar[i]=arr[i];
			}
			arr =ar;
		}
		super.push(item);
		
	}

}
