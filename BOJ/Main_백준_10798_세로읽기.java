import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_10798_세로읽기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] wall = new char[5][15];
		for(int i=0;i<5;i++){
			String line = br.readLine();
			for(int j=0;j<line.length();j++)
				wall[i][j] = line.charAt(j);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<15;j++){
			for(int i=0;i<5;i++)
				if(wall[i][j] != 0) sb.append(wall[i][j]);
		}
		
		System.out.print(sb.toString());
	}
}