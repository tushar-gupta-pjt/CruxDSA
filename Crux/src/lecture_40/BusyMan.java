package lecture_40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			Pair [] p = new Pair[n];
			for(int i=0;i<p.length;i++) {
				int st=sc.nextInt();
				int et = sc.nextInt();
				p[i]=new Pair(st,et);
			}
			Arrays.sort(p, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
				
			});
			int activities = 1;
			int end =p[0].et;
			for(int i =1 ;i<p.length;i++) {
				if(p[i].st>=end) {
					activities++;
					end=p[i].et;
				}
			}
			System.out.println(activities);
		}

	}
	
	
	static class Pair{                                                     // inner class ko static bnana padega kyunki main static hai
		int st;
		int et;
		
		public Pair(int st, int et) {
			this.et = et;
			this.st = st;
		}
	}

}
