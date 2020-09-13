import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_백준_2628_종이자르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> width = new ArrayList<>();
		ArrayList<Integer> height = new ArrayList<>();
		
		width.add(0); height.add(0);
		
		st = new StringTokenizer(br.readLine(), " ");
	
		int line = Integer.parseInt(st.nextToken());
		while(0 < line--) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int flag = Integer.parseInt(st.nextToken());
			if(flag == 0) width.add(Integer.parseInt(st.nextToken()));
			else height.add(Integer.parseInt(st.nextToken()));
		}
		
		width.add(H); height.add(W);
		
		Collections.sort(width); Collections.sort(height);
		
		int answer = -1;
		for(int i=0;i<width.size()-1;i++) {
			int y1 = width.get(i);
			int y2 = width.get(i+1);
			
			for(int j=0;j<height.size()-1;j++) {
				int x1 = height.get(j);
				int x2 = height.get(j+1);
				
				int area = (x2 - x1) * (y2 - y1);
				answer = answer < area ? area : answer;
			}
		}
		
		System.out.print(answer);
	}
}