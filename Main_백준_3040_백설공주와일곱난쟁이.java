import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_3040_백설공주와일곱난쟁이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] dwarf = new int[9];
		int sum = 0;
		for(int i=0;i<9;i++){
			st = new StringTokenizer(br.readLine(), " ");
			dwarf[i] = Integer.parseInt(st.nextToken());
			
			sum += dwarf[i];
		}
		
		Arrays.sort(dwarf);
		
		int idx = 0, jdx = 0;
		for(int i=0;i<9;i++){
			for(int j=i+1;j<9;j++){
				if((sum - dwarf[i] - dwarf[j]) == 100){
					idx = i;
					jdx = j;
					
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<9;i++){
			if(i == idx || i == jdx) continue;
	
			if(i < 8) sb.append(dwarf[i] + "\n");
			else sb.append(dwarf[i]);
		}
		
		System.out.print(sb.toString());
	}
}