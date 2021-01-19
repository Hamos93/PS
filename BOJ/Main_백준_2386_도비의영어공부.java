import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2386_도비의영어공부 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String[] input = br.readLine().toLowerCase().split(" ");
			char ch = input[0].charAt(0);

			if(ch == '#') return;

			int[] arr = new int[26];

			for(int i=1;i<input.length;i++) {
				for(int j=0;j<input[i].length();j++) {
					int value = input[i].charAt(j) - 97;

					if(value < 0 || 26 <= value) 
						continue;

					arr[input[i].charAt(j) - 97]++;
				}
			}

			System.out.println(ch + " " + arr[ch - 97]);
		}
	}
}