import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3020_개똥벌레 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		int[] bottom = new int[H + 1];
		int[] top = new int[H + 1];
	
		for(int i=0;i<N/2;i++) {
			int h1 = Integer.parseInt(br.readLine());
			int h2 = Integer.parseInt(br.readLine());
			
			bottom[h1]++; top[h2]++;
		}
		
		int[] P1 = new int[H + 1];
		int[] P2 = new int[H + 1];
	
		int sum1 = 0, sum2 = 0;
		for(int i=1;i<=H;i++) {
			sum1 += bottom[i];
			P1[i] = sum1;
			
			sum2 += top[i];
			P2[i] = sum2;
		}
		
		int min = Integer.MAX_VALUE, cnt = 0;
		for(int i=1;i<=H;i++) {
			int crush = 0;
			
			crush += P1[H] - P1[i-1];
			crush += P2[H] - P2[H-i];
		
			if(crush < min) {
				min = crush;
				cnt = 1;
			}else if(crush == min) cnt++;
		}
		
		System.out.print(min + " " + cnt);
	}
}