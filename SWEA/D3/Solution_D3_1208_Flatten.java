import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1208_Flatten {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int dump = Integer.parseInt(st.nextToken());

			int[] box = new int[100];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<100;i++)
				box[i] = Integer.parseInt(st.nextToken());

			while(dump-- > 0) {
				int high = Integer.MIN_VALUE, row = Integer.MAX_VALUE;
				int highIdx = 0, rowIdx = 0;
			
				for(int i=0;i<100;i++) {
					if(high < box[i]) {
						high = box[i];
						highIdx = i;
					}
					
					if(box[i] < row) {
						row = box[i];
						rowIdx = i;
					}
				}
				
				box[highIdx]--;
				box[rowIdx]++;
			}
			
			int highResult = Integer.MIN_VALUE, rowResult = Integer.MAX_VALUE;
			for(int i=0;i<100;i++) {
				highResult = box[i] < highResult ? highResult : box[i];
				rowResult = rowResult < box[i] ? rowResult : box[i];
			}
			
			sb.append("#" + tc + " " + (highResult - rowResult) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}