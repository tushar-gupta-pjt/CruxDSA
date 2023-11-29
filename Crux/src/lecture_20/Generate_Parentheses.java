package lecture_20;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		GenerateParentheses(n,0,0,"");

	}
	public static void GenerateParentheses(int n, int open, int close, String ans) {
		
		if(open==n && close==n) {
			System.out.println(ans+" ");
			return;
		}
		
		
		if(open<n) {
			GenerateParentheses(n,open+1,close,ans+"(");
			
		}
		if(close<open) {
			GenerateParentheses(n,open,close+1,ans+")");
		}
	}

}
