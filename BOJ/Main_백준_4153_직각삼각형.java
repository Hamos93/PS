import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_4153_직각삼각형 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true) {
			int[] array = new int[3];

			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0;i<3;i++)
				array[i] = Integer.parseInt(st.nextToken());
			
			if(array[0] == 0 && array[1] == 0 && array[2] == 0) break;

			Arrays.sort(array);
			
			if(array[0] * array[0] + array[1] * array[1] == array[2] * array[2]) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}