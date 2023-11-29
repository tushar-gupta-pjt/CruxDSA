package lecture_17;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {1,0,2,9};
		int []arr2= {3,4,5,6,7};
		ArraysSum(arr1,arr2);
		

	}
	
	public static void ArraysSum(int[] arr1,int arr2[]) {
		ArrayList<Integer>ll=new ArrayList<>();
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		
		while(i>=0 && j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			int rem=sum%10;
			ll.add(rem);
			carry=sum/10;
			i--;
			j--;
		}
		while(j>=0) {
			int sum=arr2[j]+carry;                     //agar  doosri array bachi hai
			int rem=sum%10;
			ll.add(rem);
			carry=sum/10;
			j--;
			
		}
		while(i>=0) {                                   // agar pehli array bachi hai
			int sum=arr1[j]+carry;
			int rem=sum%10;
			ll.add(rem);
			carry=sum/10;
			i--;
		}
		if(carry!=0)ll.add(carry); // agar bacha hua carry hai
		
		for(i=ll.size()-1;i>=0;i--) {
			System.out.print(ll.get(i)+", ");
		}
		System.out.println("END");
		
	}

}
