import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_����_2193_��ģ�� {
	private static final int NUM = 90; 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		// d[N][0]: ���̰� N�ڸ��̸鼭 0���� ������ ��ģ���� ����
		// d[N][1]: ���̰� N�ڸ��̸鼭 1�� ������ ��ģ���� ����
		long[][] d = new long[NUM + 1][2];
		d[1][0] = 0;
		d[1][1] = 1;
		
		for(int i=2;i<NUM+1;i++) {
			d[i][0] = d[i-1][0] + d[i-1][1];
			d[i][1] = d[i-1][0];
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		System.out.print(d[N][0] + d[N][1]);
	}
}