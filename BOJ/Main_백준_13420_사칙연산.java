import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13420_사칙연산 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			String[] input = br.readLine().split(" ");
			
			long operand1 = Long.parseLong(input[0]);
			long operand2 = Long.parseLong(input[2]);
			long result = Long.parseLong(input[4]);
			
			boolean flag = true;
			switch (input[1]) {
			case "+":
				if((operand1 + operand2) != result) flag = false;
				break;
			case "-":
				if((operand1 - operand2) != result) flag = false;
				break;
			case "*":
				if((operand1 * operand2) != result) flag = false;
				break;
			case "/":
				if((operand1 / operand2) != result) flag = false;
				break;
			}
			
			if(flag) System.out.println("correct");
			else System.out.println("wrong answer");
		}
	}
}