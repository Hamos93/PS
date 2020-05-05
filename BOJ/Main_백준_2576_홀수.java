import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2576_홀수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		boolean flag = false;
		int sum = 0, min = Integer.MAX_VALUE;
		
		for(int i=1;i<=7;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			int value = Integer.parseInt(st.nextToken());
			if(value % 2 == 1){
				flag = true;
				sum += value;
				min = value < min ? value : min; 
			}
		}
		
		if(!flag) System.out.print("-1");
		else System.out.print(sum + "\n" + min);
	}
}