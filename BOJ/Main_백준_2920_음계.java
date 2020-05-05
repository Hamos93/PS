import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2920_음계 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] note = new int[8];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<note.length;i++)
			note[i] = Integer.parseInt(st.nextToken());		
		
		int diff = 0;
		for(int i=1;i<note.length;i++){
			diff = note[i] - note[i-1]; 
			
			if(diff != 1 && diff != -1){
				System.out.print("mixed");
				return;
			}
		}
		
		if(diff == 1) System.out.print("ascending");
		else if(diff == -1) System.out.print("descending");
	}
}