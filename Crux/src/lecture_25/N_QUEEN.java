package lecture_25;

public class N_QUEEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean [][]board=new boolean[n][n];
		QueenProblem(board, n, 0);

	}

	public static void QueenProblem(boolean[][] board, int n, int row) {
		
		// TODO Auto-generated method stub
		if(n==0) {
			Display(board);
			System.out.println();
			return;
		}
		
		
		for(int col=0;col<board.length;col++) {              //since both col and row are n;
			if(isitsafe(board, row, col)==true) {
				board[row][col]=true;
				QueenProblem(board, n-1, row+1);
				board[row][col]=false;
				
			}
		}
		
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		//upward
		for(int r=row;r>=0;r--) {
			if(board[r][col]==true) {
				return false;
			}
		}
		//right diagonal row decreases and col increases
		int r=row;
		int c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		//left diagonal
		
		 r=row;
		 c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		return true;
	}

}
