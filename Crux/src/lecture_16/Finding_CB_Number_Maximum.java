package lecture_16;

public class Finding_CB_Number_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int CountCBNumber(String str) {
		int count=0;
		boolean [] visited = new boolean [str.length()]; //for checking if a number is involved in making cb number already
		for(int len=1;len<=str.length();len++) {
			for(int j=len;j<=str.length();j++){
				int i=j-len;
				String s=str.substring(i,j);
				long n=Long.parseLong(s); //changing into int/long
				if(IsCBNumber(n)==true && isValid(visited,i,j-1)==false) {
					count++;
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}
		return count;
	}
	
	public static boolean isValid(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for(;i<=j;i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
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
