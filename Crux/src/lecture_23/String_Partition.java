package lecture_23;

public class String_Partition {

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
			partition(ques.substring(i),ans+ s+ "|");
		}
	}

}
