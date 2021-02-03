import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1145_적어도대부분의배수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		List<Integer> list = new ArrayList<>();
		
		int min = 101;
		for(int i=0;i<5;i++) {
			int value = Integer.parseInt(st.nextToken());

			list.add(value);
			min = value < min ? value : min;
		}
		
		int div = min;
		while(true) {
			int cnt = 0;
			for(int i=0;i<5;i++) {
				if(div % list.get(i) == 0) 
					cnt++;
			}
			
			if(3 <= cnt) {
				System.out.print(div);
				return;
			}
			
			div++;
		}
	}
}