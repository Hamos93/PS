import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2581_소수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<>();
		for(int i=M;i<=N;i++) {
			if(i == 1) continue;

			int num = i;

			boolean flag = true;
			for(int j=2;j<=num/2;j++) {
				if(num % j == 0) {
					flag = false;
					break;
				}
			}

			if(flag) list.add(num);
		}

		if(list.size() != 0) {
			int sum = 0;
			for(int i=0;i<list.size();i++)
				sum += list.get(i);

			System.out.print(sum + "\n" + list.get(0));
		}else System.out.print("-1");
	}
}