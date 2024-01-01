package lecture_46;

public class Check_ith_bit {
	public static void main(String[] args) {
		int n = 68;
		int i = 3;
		int mask = (1 << i);
		if ((n & mask) != 0) {
			System.out.println("Set hai try nhi kro");
		} else {
			System.out.println("Set nhi hai dekh skte hain");
		}

	}

}
