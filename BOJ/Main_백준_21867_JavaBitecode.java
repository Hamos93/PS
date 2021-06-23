import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_21867_JavaBitecode {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        char[] input = br.readLine().trim().toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            if(input[i] == 'J' || input[i] == 'A' || input[i] == 'V') input[i] = '-';
            else sb.append(input[i]);
        }

        if(sb.toString().length() == 0) System.out.print("nojava");
        else System.out.print(sb.toString());
    }
}