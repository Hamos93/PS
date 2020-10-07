import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10989_수정렬하기3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] num = new int[10001];
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			num[Integer.parseInt(st.nextToken())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=10000;i++) {
			while(0 < num[i]--) sb.append(i + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}