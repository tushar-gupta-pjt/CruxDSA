package lecture_22;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int tq=2;
		boolean[]board=new boolean[n];
		Permutation(board,0,tq,"");
		

	}
	public static void Permutation(boolean[] board, int qpsf, int tq, String ans) {                   //qpsf----->queen placed so far
		
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				Permutation(board,qpsf+1,tq,ans+"b"+i+"q"+qpsf);
				board[i]=false;                                   //Backtracking
			}
		}
		
	}

}
