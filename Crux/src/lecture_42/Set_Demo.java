package lecture_42;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(10);
		set.add(15);
		set.add(12);
		set.add(-1);
		set.add(16);
		set.add(30);
		System.out.println(set);
		//contains
//		System.out.println(set.contains(1));
//		System.out.println(set.contains(134));
//		//remove
//		System.out.println(set.remove(1));
//		System.out.println(set.remove(1000));
//		System.out.println(set);
		
		Set<Integer> set1 = new TreeSet<>();
		
		set1.add(1);
		set1.add(10);
		set1.add(15);
		set1.add(12);
		set1.add(-1);
		set1.add(16);
		set1.add(30);
		System.out.println(set1);
		
		
		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(10);
		set2.add(15);
		set2.add(12);
		set2.add(-1);
		set2.add(16);
		set2.add(30);
		System.out.println(set2);
		
		for(int v:set) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		
		
	}

}
