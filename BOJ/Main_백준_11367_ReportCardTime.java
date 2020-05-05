import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11367_ReportCardTime {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hobbit = Integer.parseInt(st.nextToken());
		while(hobbit-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			String name = st.nextToken();
			int grade = Integer.parseInt(st.nextToken());
			
			if(97 <= grade && grade <= 100) System.out.println(name + " A+");
			else if(90 <= grade && grade <= 96) System.out.println(name + " A");
			else if(87 <= grade && grade <= 89) System.out.println(name + " B+");
			else if(80 <= grade && grade <= 86) System.out.println(name + " B");
			else if(77 <= grade && grade <= 79) System.out.println(name + " C+");
			else if(70 <= grade && grade <= 76) System.out.println(name + " C");
			else if(67 <= grade && grade <= 69) System.out.println(name + " D+");
			else if(60 <= grade && grade <= 66) System.out.println(name + " D");
			else System.out.println(name + " F");
		}
	}
}