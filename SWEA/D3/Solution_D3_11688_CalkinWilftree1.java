import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_11688_CalkinWilftree1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int tc=1;tc<=T;tc++){
            char[] input = br.readLine().trim().toCharArray();

            int a = 1, b = 1;
            for(char dir : input){
                if(dir == 'L') b += a;
                else a += b;
            }

            sb.append("#" + tc + " " + a + " " + b + "\n");
        }

        System.out.print(sb.toString().trim());
    }
}