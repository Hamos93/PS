import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_11655_ROT13 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] arr = br.readLine().toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(65 <= arr[i] && arr[i] <= 90) {
				arr[i] += 13;

				if(90 < arr[i]) {
					arr[i] -= 90;
					arr[i] += 64;
				}
			}

			if(97 <= arr[i] && arr[i] <= 122) {
				arr[i] += 13;

				if(122 < arr[i]) {
					arr[i] -= 122;
					arr[i] += 96;
				}
			}
			
			System.out.print(arr[i]);
		}
	}
}