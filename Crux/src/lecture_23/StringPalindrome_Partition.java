package lecture_23;

public class StringPalindrome_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		partition(s,"");

	}
	public static void partition(String ques,String ans) {
			
			if(ques.length()==0) {
				System.out.println(ans);
				return;
			}
			
			
			for(int i=1;i<=ques.length();i++) {
				String s=ques.substring(0,i);
				if(IsPalindrome(s)) {
					partition(ques.substring(i),ans+ s+ "|");
				}
			}
		}

	public static boolean IsPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}


}
