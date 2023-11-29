package lecture_23;
import java.util.*;
public class CombinationSum_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin= {2,3,5};
		int amount=10;
		List<Integer>ll=new ArrayList<>();
		List<List<Integer>>ans=new ArrayList<>();
		
		Combination(coin,amount,ll,0,ans);

	}
		
	public static void Combination(int[] coin, int amount, List<Integer>ll,int idx,List<List<Integer>>ans) {
			
			if(amount==0) {
				ans.add(new ArrayList<>(ll));                          // makes new LIst every time , because if we add only ll ,changes in ll will also show up in ans
				return;
			}
			
			for(int i=idx;i<coin.length;i++) {
				if(amount>=coin[i]) {
					ll.add(coin[i]);
					Combination(coin, amount-coin[i], ll,i,ans);
					ll.remove(ll.size()-1);
				}
			}
		}

}
