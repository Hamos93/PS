import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1289_원재의메모리복구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			char[] originMemory = st.nextToken().toCharArray();
			int len = originMemory.length;
			
			char[] memory = new char[len];
			for(int i=0;i<len;i++)
				memory[i] = '0';
			
			int cnt = 0;
			
			for(int i=0;i<len;i++) {
				if(originMemory[i] != memory[i]) {
					cnt++;
					
					for(int j=i;j<len;j++)
						memory[j] = originMemory[i];
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
	}
}