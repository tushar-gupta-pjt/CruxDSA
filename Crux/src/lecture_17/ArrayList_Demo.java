package lecture_17;
import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		
		ll.add(0,89);
	
		System.out.println(ll);
		// size
		System.out.println(ll.size());
		//get
		System.out.println(ll.get(2));
		
		//remove
		
		System.out.println(ll.remove(2));
		
		ll.add(230);
		ll.add(-430);
		System.out.println(ll);
		//update
		
		System.out.println(ll.set(2, -97));
		
		System.out.println(ll);
		
		//sort
		
		Collections.sort(ll);
		System.out.println(ll);
		
		
		//display
		
		
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		System.out.println(ll);
		// for-each loop
		for(int a:ll) {
			System.out.print(a+" ");
		}
	}

}
