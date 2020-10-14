import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1138_한줄로서기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[] height = new int[N+1];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=N;i++)
			height[i] = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<>();
		for(int i=N;1<=i;i--)
			list.add(height[i], i);

		for(int no : list)
			System.out.print(no + " ");
	}
}