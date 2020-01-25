import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11536_줄세우기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		String[] name = new String[N];
		for(int i=0;i<N;i++)
			name[i] = br.readLine();
	
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=1;i<N;i++){
			if(name[i-1].compareTo(name[i]) <= 0) cnt1++;
			else cnt2++;
		}
		
		if(1<=cnt1 && 1<=cnt2){
			System.out.print("NEITHER");
			return;
		}
		
		if(cnt1 == 0) System.out.print("DECREASING");
		else System.out.print("INCREASING");
	}
}