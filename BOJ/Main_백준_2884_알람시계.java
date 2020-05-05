import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2884_알람시계 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(h == 0){
			if(45 <= m) System.out.print(h + " " + (m - 45));
			else {
				int tmp = 45 - m;
				tmp = 60 - tmp;
				h = 23;
				
				System.out.print(h + " " + tmp);
			}
		}else {
			if(45 <= m) System.out.print(h + " " + (m - 45));
			else {
				int tmp = 45 - m;
				tmp = 60 - tmp;
				h--;
				
				System.out.print(h + " " + tmp);
			}
		}
	}
}