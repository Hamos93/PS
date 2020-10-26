import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_6996_애너그램 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			String word1 = st.nextToken();
			String word2 = st.nextToken();

			if(word1.length() != word2.length()) {
				System.out.println(word1 + " & " + word2 + " are NOT anagrams.");
				continue;
			}

			char[] arr1 = word1.toCharArray();
			char[] arr2 = word2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			boolean flag = true;
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					flag = false;
					break;
				}
			}

			if(flag) System.out.println(word1 + " & " + word2 + " are anagrams.");
			else System.out.println(word1 + " & " + word2 + " are NOT anagrams.");
		}
	}
}