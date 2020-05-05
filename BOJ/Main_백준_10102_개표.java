import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10102_개표 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int V = Integer.parseInt(st.nextToken());
		String result = br.readLine().trim();
		
		int A = 0, B = 0;
		for(int i=0;i<V;i++){
			char ch = result.charAt(i);
			
			if(ch == 'A') A++;
			else B++;
		}
		
		if(B < A) System.out.print("A");
		else if(A < B) System.out.print("B");
		else System.out.print("Tie");
	}
}