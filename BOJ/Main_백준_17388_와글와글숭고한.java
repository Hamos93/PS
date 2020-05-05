import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_17388_와글와글숭고한 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] univ = new int[3];
		int sum = 0;
		for(int i=0;i<3;i++){
			univ[i] = Integer.parseInt(st.nextToken());
			
			sum += univ[i];
		}
		
		if(100 <= sum) System.out.print("OK");
		else{
			int min = univ[0];
			int idx = 0;
			for(int i=0;i<3;i++){
				if(univ[i] < min) {
					min = univ[i];
					idx = i;
				}
			}
			
			if(idx == 0) System.out.print("Soongsil");
			else if(idx == 1) System.out.print("Korea");
			else System.out.print("Hanyang");
		}
	}
}