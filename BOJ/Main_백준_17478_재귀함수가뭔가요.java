import java.util.Scanner;

public class Main_백준_17478_재귀함수가뭔가요 {
	private static String str1 = "\"재귀함수가 뭔가요?\"";
	private static String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
	private static String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
	private static String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
	private static String str5 = "라고 답변하였지.";
	
	public static void print(int cnt, int N) {
		if(N < cnt) return;
		
		String line = "";
		for(int i=0;i<cnt;i++)
			line += "____";
		
		System.out.println(line + str1);
		if(cnt == N) {
			System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			System.out.println(line + str5);
			return;
		}
		
		System.out.println(line + str2);
		System.out.println(line + str3);
		System.out.println(line + str4);
	
		print(cnt + 1, N);
		
		System.out.println(line + str5);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		print(0, N);
	}
}