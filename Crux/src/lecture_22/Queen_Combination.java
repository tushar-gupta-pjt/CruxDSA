package lecture_22;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int tq=2;
		boolean[]board=new boolean[n];
		Combination(board,0,tq,"",0);

	}
	public static void Combination(boolean[] board, int qpsf, int tq, String ans, int idx) {                   //qpsf----->queen placed so far
			
			if(qpsf==tq) {
				System.out.println(ans);
				return;
			}
			
			for(int i=idx;i<board.length;i++) {
				if(board[i]==false) {
					board[i]=true;
					Combination(board,qpsf+1,tq,ans+"b"+i+"q"+qpsf,i+1);
					board[i]=false;                                   //Backtracking
				}
			}
			
		}

}
