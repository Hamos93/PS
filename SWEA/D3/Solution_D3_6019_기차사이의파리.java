import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6019_기차사이의파리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double D = Double.parseDouble(st.nextToken());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());

			// 1. 파리가 기차B와 닿는 순간의 시간 (S1 = D / (B + F))
			double S1 = D / (B + F);
	
			// 2. 파리가 기차B와 닿는 순간의 기차A와 파리의 거리 (D1 = F * S1 - A * S1)
			double D1 = (F - A) * S1;
			
			// 3. 파리가 다시 기차B의 속력으로 기차 A와 닿는 순간의 시간 (S2 = D1 / (A + B))
			double S2 = D1 / (A + B);
			
			// 4. 파리의 총 이동거리 = 기차B를 향해 이동했던 거리 + 다시 기차A로 향했던 거리
			double answer = F * (S1 + S2);
		
			System.out.printf("#%d %.10f", tc, answer);
		}
	}
}