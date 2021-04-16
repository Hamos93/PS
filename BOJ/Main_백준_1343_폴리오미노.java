import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1343_폴리오미노 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().trim().toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 'X') {
				int len = 0;
				for(int j=i;j<arr.length;j++) {
					if(arr[j] == 'X') len++;
					else break;
				}
				
				if(len % 2 != 0) {
					System.out.print("-1");
					return;
				}
				
				if(len % 4 == 0) {
					for(int j=i;j<i+len;j++)
						arr[j] = 'A';
				}else if(2 < len && len % 4 == 2) {
					for(int j=i;j<i+len;j++) {
						if((j == i + len - 1) || (j == i + len - 2)) arr[j] = 'B';
						else arr[j] = 'A';
					}
				}else {
					for(int j=i;j<i+len;j++)
						arr[j] = 'B';
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char ch : arr)
			sb.append(ch);
		
		System.out.print(sb.toString());
	}
}