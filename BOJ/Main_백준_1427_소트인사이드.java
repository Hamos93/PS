import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_백준_1427_소트인사이드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine().trim();
		
		int[] array = new int[num.length()];
		for(int i=0;i<array.length;i++)
			array[i] = num.charAt(i) - '0';
		
		Arrays.sort(array);
		
		StringBuilder sb = new StringBuilder();
		for(int i=array.length-1;0<=i;i--)
			sb.append(array[i]);
		
		System.out.print(sb.toString());
	}
}