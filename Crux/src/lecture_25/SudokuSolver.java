package lecture_25;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
				         { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
				         { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				         { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
				         { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
				         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				         { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
				         { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
				         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		
		SudokuSolved(grid,0,0 );


	}

	public static void SudokuSolved(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if(col==9) {                       //zero based indexing -->0 to 8 rows and column
			row++;
			col=0;
		}
		if(row==9) {
			Display(grid);
			return;
		}
		if(grid[row][col] !=0) {
			SudokuSolved(grid, row, col+1);
		}
		else {
			for(int val=1;val<=9;val++) {
				if(isitsafe(grid, row, col, val)==true) {
					grid[row][col]=val;
					SudokuSolved(grid, row, col+1);
					grid[row][col]=0;
				}
			}
		}
		
	}
	public static boolean isitsafe(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		//row
		for(int c=0;c<9;c++) {
			if(grid[row][c]==val) {
				return false;
			}
		}
		// column
		for(int r=0;r<9;r++) {
			if(grid[r][col]==val) {
				return false;
			}
		}
		// for 3*3 matrix
		
		int r=row-row%3;           // this modulo value depends on size of original sudoku matrix
		int c=col-col%3;
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}

	public static void Display(int [][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	

}
