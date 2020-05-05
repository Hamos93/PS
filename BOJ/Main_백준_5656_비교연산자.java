import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5656_비교연산자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int T = 1;
		while(true){
			st = new StringTokenizer(br.readLine(), " ");

			int operand1 = Integer.parseInt(st.nextToken());
			String operator = st.nextToken();
			int operand2 = Integer.parseInt(st.nextToken());

			if(operator.equals("E")) break;

			boolean flag = false;
			switch (operator) {
			case ">":
				if(operand1 > operand2) flag = true;
				else flag = false;
				break;
			case ">=":
				if(operand1 >= operand2) flag = true;
				else flag = false;
				break;
			case "<":
				if(operand1 < operand2) flag = true;
				else flag = false;
				break;
			case "<=":
				if(operand1 <= operand2) flag = true;
				else flag = false;
				break;
			case "==":
				if(operand1 == operand2) flag = true;
				else flag = false;
				break;
			case "!=":
				if(operand1 != operand2) flag = true;
				else flag = false;
				break;
			}
			
			System.out.println("Case " + T + ": " + flag);
			T++;
		}
	}
}