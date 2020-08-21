import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13163_닉네임에갓붙이기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		while(0 < N--) {
			String[] nickname = br.readLine().trim().split(" ");
			nickname[0] = "god";
			
			String answer = "";
			for(int i=0;i<nickname.length;i++)
				answer += nickname[i];
			
			System.out.println(answer);
		}
	}
}