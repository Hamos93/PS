import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5355_화성수학 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			double num = Double.parseDouble(st.nextToken());
			while(st.hasMoreTokens()){
				char operator = st.nextToken().charAt(0);
				
				if(operator == '@') num *= 3;
				else if(operator == '%') num += 5;
				else num -= 7;
			}

			String answer = String.format("%.2f", num);
			System.out.println(answer);
		}
	}
}