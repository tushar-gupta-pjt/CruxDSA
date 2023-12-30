package lecture_45;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,2};
		int k = 10;
		System.out.println(Product_Less_Than_K(arr,k));
	}
	
	
	public static int Product_Less_Than_K(int[]arr, int k) {
		int ans=0;
		int si=0,ei=0;
		int p=1;
		
		while(ei<arr.length) {
			
			//Grow window
			p=p*arr[ei];
			
			//Shrink Window
			while(p>=k && si<=ei) {             //si<=ei (condition for array index out of bound, because we cannot divide p by something which is not in array)
				p=p/arr[si];
				si++;
			}
			//Calculate answer
			ans+=(ei-si+1);       //ans me window size add hoga, because utne hi subarray ban skte hain
			ei++;
		}
		return ans;
	}

}
