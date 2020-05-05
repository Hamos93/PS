public class Main_백준_4673_셀프넘버 {
	private static int N = 10000;
	private static boolean[] visit;
	
	private static void d(String num) {
		if(N < Integer.parseInt(num)) return;
		
		int sum = Integer.parseInt(num);
		for(int i=0;i<num.length();i++)
			sum += num.charAt(i) - '0';
		
		if(N < sum) return;
		else {
			visit[sum] = true;
			d(Integer.toString(sum));
		}
	}
	
	public static void main(String[] args) {
		visit = new boolean[N + 1];
		
		for(int i=1;i<=N;i++)
			if(!visit[i]) d(Integer.toString(i));
	
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++)
			if(!visit[i]) sb.append(i + "\n");
		
		System.out.print(sb.toString());
	}
}