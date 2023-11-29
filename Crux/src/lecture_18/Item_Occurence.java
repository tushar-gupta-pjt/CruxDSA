package lecture_18;

public class Item_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {2,3,4,3,4,3,2,5,3,8,11};
		int item=4;
		
		System.out.println(Index(arr,item,0));
		

	}

//	public static int findItem(int item,int []arr,int ans) {
//		// TODO Auto-generated method stub
//		int maxindex=arr.length-1;
//		if(ans>maxindex)return -1;
//		if(arr[ans]==item)return ans;
//		return findItem(item,arr,ans+1);
//		
//	}
	
	public static int Index(int[]arr,int item,int i) {
		// TODO Auto-generated method stub
		
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return Index(arr,item,i+1);
		
	}

}
