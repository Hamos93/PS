import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2947_나무조각 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[5];
		for(int i=0;i<5;i++)
			arr[i] = Integer.parseInt(st.nextToken());

		while(true) {
			boolean flag = true;

			for(int i=0;i<4;i++) {
				if(arr[i+1] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;

					flag = false;

					for(int j=0;j<5;j++)
						System.out.print(arr[j] + " ");
					System.out.println();
				}
			}

			if(flag) break;
		}
	}
}