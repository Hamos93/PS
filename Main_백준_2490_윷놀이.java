import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2490_윷놀이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int T = 3;
		while(T-- > 0){
			int zeroCnt = 0;

			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<4;i++){
				int n = Integer.parseInt(st.nextToken());

				if(n == 0) zeroCnt++;
			}

			switch (zeroCnt) {
			case 0: 
				System.out.println("E");
				break;
			case 1: 
				System.out.println("A");
				break;
			case 2: 
				System.out.println("B");
				break;
			case 3: 
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			}
		}
	}
}