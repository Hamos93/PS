import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4641_Doubles {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true){
			st = new StringTokenizer(br.readLine(), " ");
			
			boolean[] visit = new boolean[100];
			while(st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				
				if(value == -1) return;
				if(value == 0) break; 

				visit[value] = true;
			}
			
			int answer = 0;
			for(int i=1;i<50;i++)
				if(visit[i] == true && visit[i * 2] == true) answer++;
			
			System.out.println(answer);
		}
	}
}