import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11948_과목선택 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] science = new int[4];
		int[] social = new int[2];
		
		for(int i=0;i<4;i++){
			st = new StringTokenizer(br.readLine(), " ");
			science[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<2;i++){
			st = new StringTokenizer(br.readLine(), " ");
			social[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(science);
		Arrays.sort(social);
		
		int sum = 0;
		sum += science[1] + science[2] + science[3];
		sum += social[1];
		
		System.out.print(sum);
	}
}