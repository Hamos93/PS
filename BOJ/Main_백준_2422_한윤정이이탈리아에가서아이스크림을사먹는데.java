import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_백준_2422_한윤정이이탈리아에가서아이스크림을사먹는데 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] arr = new ArrayList[N+1];
		for(int i=1;i<=N;i++)
			arr[i] = new ArrayList<>();
		
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int value1 = Integer.parseInt(st.nextToken());
			int value2 = Integer.parseInt(st.nextToken());
		
			arr[value1].add(value2);
			arr[value2].add(value1);
		}
		
		int cnt = 0;
		for(int i=1;i<=N;i++) {
			for(int j=i+1;j<=N;j++) {
				if(arr[i].contains(j)) continue;
				for(int k=j+1;k<=N;k++) {
					if(arr[i].contains(k) || arr[j].contains(k)) 
						continue;
					
					cnt++;
				}
			}
		}
		
		System.out.print(cnt);
	}
}