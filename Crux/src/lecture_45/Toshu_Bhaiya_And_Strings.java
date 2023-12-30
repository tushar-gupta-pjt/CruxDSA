package lecture_45;

public class Toshu_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababaabaaaaabababa";
		int k =2;
		int flipa = MaximumLength(str, k, 'a');
		int flipb = MaximumLength(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}
	public static int MaximumLength(String s, int k, char ch) {
		
		int flip=0;
		int si=0,ei=0;
		int ans =0;
		while(ei<s.length()) {
			
			//Grow
			if(s.charAt(ei)==ch) {
				flip++;
			}
			
			//Shrink
			while(flip>k && si<=ei) {
				
				if(s.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			
			// Answer Updation
			
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
		
	}

}
