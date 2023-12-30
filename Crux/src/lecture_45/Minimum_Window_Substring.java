package lecture_45;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcabavcsbacsbacsba";
		String t = "avbc";

		System.out.println(MinimumWindow_SubString(s, t));

	}

	public static String MinimumWindow_SubString(String s, String t) {

		int[] freqt = new int[256];

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freqt[ch]++;
		}

		int si = 0, ei = 0;
		int start_index = -1;
		int len = Integer.MAX_VALUE;
		int count = 0;
		int[] freqs = new int[256];
		while (ei < s.length()) {

			// grow
			char ch = s.charAt(ei);
			freqs[ch]++;
			if (freqs[ch] <= freqt[ch]) {
				count++;
			}

			if (t.length() == count) {
				// shrink

				while (freqs[s.charAt(si)] > freqt[s.charAt(si)]) {               // s ke char ke corresponding t me frequency check kar hre hain
					freqs[s.charAt(si)]--;
					si++;

				}
				// ans
				if (len > ei - si + 1) {
					len = ei - si + 1;
					start_index = si;
				}

			}

			ei++;
		}
		if (start_index == -1) {
			return "";
		}
		return s.substring(start_index, start_index + len);
	}

}
