package lecture_40;

import java.util.Arrays;
import java.util.Comparator;

public class Car_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars [] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 10, "Yellow");
		arr[2] = new Cars(345, 3, "Black");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Magenta");
		Display(arr);
		Arrays.sort(arr, new Comparator<Cars>(){

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.price - o2.price;
			}
			
			
		});

	}

	private static <T> void Display(T[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static <T extends Comparable<T>> void Sort(T[]arr) {
		for(int turn =1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(arr[i].compareTo(arr[i+1])>0){                               //compare to , is cheez ko bound set karna bolte hain
					T temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

}
