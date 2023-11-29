package lecture_30;

import java.util.Stack;

public class Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="IIIDIDDD";
		

	}
	
	public static String String_smallest_Number(String s) {
		int[]ans = new int[s.length()+1];
		Stack<Integer> st= new Stack<>();
		int c=1;
		
		for(int i= 0; i<=s.length(); i++) {
			if(i == s.length() || s.charAt(i)== 'I') {                         // s.length pehle aayega, wrna array index out of bound hojayega
				ans[i]=c;
				c++;
				while(!s.isEmpty()) {
					ans[st.pop()] =c;
					c++;
				}
			}
			else {
				st.push(i);
			}
		}
		String s1="";
		for(int i=0;i<ans.length;i++) {
			s1+=ans[i];
		}
		return s1;
	}

}
