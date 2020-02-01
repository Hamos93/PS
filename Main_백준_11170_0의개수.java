import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11170_0의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			int answer = 0;
			for(int i=N;i<=M;i++){
				char[] str = Integer.toString(i).toCharArray();
				
				for(int j=0;j<str.length;j++){
					if(str[j] == '0') answer++;
				}
			}
			
			System.out.println(answer);
		}
	}
}