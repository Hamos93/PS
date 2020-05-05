import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_백준_1427_소트인사이드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		
		int[] array = new int[line.length()];
		for(int i=0;i<array.length;i++)
			array[i] = line.charAt(i) - '0';

		Arrays.sort(array);
		
		for(int i=array.length-1;0<=i;i--)
			System.out.print(array[i]);
	}
}