import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2212_센서 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		List<Integer> sensor = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		
		// 집중국의 개수가 N 이상일 때
		if(N <= K) {
			// 각 센서의 위치에 설치하면 되므로 정답은 0
			System.out.print("0");
			return;
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			sensor.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(sensor);
		
		List<Integer> dist = new ArrayList<>();
		for(int i=1;i<N;i++)
			dist.add(sensor.get(i) - sensor.get(i - 1));
		
		Collections.sort(dist, Collections.reverseOrder());
		while(1 < K--) dist.remove(0);
		
		int sum = 0;
		for(int value : dist)
			sum += value;
		
		System.out.print(sum);
	}
}