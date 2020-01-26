import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_5618_공약수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] num = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(num);
		StringBuilder sb = new StringBuilder();
		
		if(n == 2){
			for(int i=1;i<=num[0];i++)
				if((num[0] % i == 0) && (num[1] % i == 0)) sb.append(i + "\n");
		}else{
			for(int i=1;i<=num[0];i++)
				if((num[0] % i == 0) && (num[1] % i == 0) && (num[2] % i == 0)) sb.append(i + "\n");
		}
		
		System.out.print(sb.toString());
	}
}