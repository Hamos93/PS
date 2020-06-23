import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10984_내학점을구해줘 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			double GPA = 0.0;
			int totalC = 0;
			while(N-- > 0) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int C = Integer.parseInt(st.nextToken());
				double G = Double.parseDouble(st.nextToken());
			
				GPA += C * G;
				totalC += C;
			}
			
			GPA /= totalC;
			
			System.out.println(totalC + " " + (Math.round(GPA * 10) / 10.0));
		}
	}
}