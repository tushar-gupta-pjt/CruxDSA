package lecture_24;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][]board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
			String word= "ABCCED";
			
			for(int i=0;i<board.length;i++){
				for(int j=0;j<board[0].length;j++) {
					if(board[i][j]==word.charAt(0)) {
						boolean ans=WordSearch(board, word, i, j, 0);
						if(ans==true) {
							System.out.println(ans);
							return;
						}
					}
				}
			}
			System.out.println(false);
		

	}
	public static boolean WordSearch(char[][]board, String word, int i, int j, int idx) {
		
		if(idx==word.length()) {
			return true;
		}
		if(i<0 || i>=board.length || j<0 || j>=board.length || board[i][j]!=word.charAt(idx)) {
			return false;
		}
		board[i][j]='*';
		int []r= {-1,1,0,0};
		int []c= {0,0,-1,1};
		for(int k=0;k<c.length;k++) {
			boolean ans=WordSearch(board,word,i+r[k],j+c[k],idx+1);
			if(ans) {
				return true;
			}
		}
//		boolean a1=WordSearch(board,word,i-1,j,idx+1);
//		boolean a2=WordSearch(board,word,i+1,j,idx+1);          //these are also right! but commented because we anted to use loop
//		boolean a3=WordSearch(board,word,i,j-1,idx+1);
//		boolean a4=WordSearch(board,word,i,j+1,idx+1);
		board[i][j]=word.charAt(idx);
//		return a1 || a2 || a3 || a4;
		return false;
	}

}
