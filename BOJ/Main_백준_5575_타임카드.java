import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5575_타임카드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int t = 3;
		while(t-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int[] time1 = new int[3];
			int[] time2 = new int[3];

			for(int i=0;i<3;i++)
				time1[i] = Integer.parseInt(st.nextToken());
			
			for(int i=0;i<3;i++)
				time2[i] = Integer.parseInt(st.nextToken());
		
			for(int i=2;0<=i;i--){
				if(time2[i] < time1[i]){
					time2[i] += 60;
					time2[i-1]--;
				}
				
				time2[i] -= time1[i];
			}
		
			for(int i=0;i<3;i++)
				System.out.print(time2[i] + " ");
		
			System.out.println();
		}
	}
}