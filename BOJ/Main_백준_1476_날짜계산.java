import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1476_날짜계산 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int e = 1, s = 1, m = 1, year = 1;
		while(true){
			if(e == 16) e = 1;
			if(s == 29) s = 1;
			if(m == 20) m = 1;
			
			if(E == e && S == s && M == m) break;
			
			e++;
			s++;
			m++;
			year++;
		}
		
		System.out.print(year);
	}
}