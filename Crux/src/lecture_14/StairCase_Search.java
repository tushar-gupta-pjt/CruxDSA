package lecture_14;



public class StairCase_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(StairCaseSearch(arr,0,arr[0].length-1,5));
		

	}
	
	public static boolean StairCaseSearch(int[][]arr,int row,int col,int target){
        while(row<arr.length && col>=0){

            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

}
