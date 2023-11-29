package lecture_16;

public class Finding_CB__Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsCBNumber(127));
		

	}
	
	public static boolean IsCBNumber(long n) {
		if(n==0||n==1) {
			return false;
		}
		int[]arr= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)return true;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(n%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
