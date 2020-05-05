import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1546_평균 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		double[] score = new double[N];
		
		double M = 0.0;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++){
			score[i] = Double.parseDouble(st.nextToken());
	
			M = M < score[i] ? score[i] : M;
		}
		
		double total = 0.0;
		for(int i=0;i<N;i++){
			score[i] = score[i] / M * 100;
			
			total += score[i];
		}
		
		System.out.print(total / N);
	}
}