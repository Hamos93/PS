import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1541_잃어버린괄호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] formula = br.readLine().split("-");

		int len = formula.length;
		for(int i=0;i<len;i++) {
			int value = 0;
			if(formula[i].contains("+")) {
				// "+" 를 기준으로 split
				String[] temp = formula[i].split("\\+");
				for(int k=0;k<temp.length;k++)
					value += Integer.parseInt(temp[k]);
			
				formula[i] = Integer.toString(value);
			}
		}

		int result = Integer.parseInt(formula[0]);
		for(int i=1;i<len;i++)
			result -= Integer.parseInt(formula[i]);

		System.out.print(result);
	}
}