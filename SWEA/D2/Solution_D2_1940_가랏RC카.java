import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1940_가랏RC카 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int RC = 0, distance = 0;
			int N = Integer.parseInt(st.nextToken());
			for(int n=0;n<N;n++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int command = Integer.parseInt(st.nextToken());
				if(command != 0) {
					int acceleration = Integer.parseInt(st.nextToken());
					if(command == 1) RC += acceleration;
					else {
						if(RC < acceleration) RC = 0;
						else RC -= acceleration;
					}
				}
				
				distance += RC;
			}
			
			System.out.println("#" + tc + " " + distance);
		}
	}
}