import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2304_창고다각형 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] pillar = new int[1001];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());

		int startIdx = 1000, endIdx = 1;
		int maxIdx = 0, maxHeight = 0;

		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");

			int L = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());

			pillar[L] = H;

			if(maxHeight < pillar[L]) {
				maxHeight = pillar[L];
				maxIdx = L;
			}

			startIdx = L < startIdx ? L : startIdx;
			endIdx = endIdx < L ? L : endIdx;
		}

		int area = 0;
		int height = 0;

		// 가장 높은 기둥 기준 왼쪽 면적
		for(int i=startIdx;i<maxIdx;i++) {
			if(height < pillar[i]) height = pillar[i];

			area += height;
		}

		height = 0;
		
		// 가장 높은 기둥 기준 오른쪽 면적
		for(int i=endIdx;maxIdx<i;i--) {
			if(height < pillar[i]) height = pillar[i];

			area += height;
		}

		// 가장 높은 기둥의 면적
		area += pillar[maxIdx];

		System.out.print(area);
	}
}