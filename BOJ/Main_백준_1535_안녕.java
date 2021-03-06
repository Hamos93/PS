import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1535_안녕 {
	private static int[] L; 
	private static int[] J; 
	private static int result;
	
	public static void greet(int idx, int health, int pleasure, int N) {
		if(0 < health && result < pleasure) result = pleasure;
		if(health <= 0 || idx == N) return;
		
		greet(idx + 1, health - L[idx], pleasure + J[idx], N);
		greet(idx + 1, health, pleasure, N);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		L = new int[N];
		J = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			L[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			J[i] = Integer.parseInt(st.nextToken());
	
		result = 0;
		greet(0, 100, 0, N);
		
		System.out.print(result);
	}
}