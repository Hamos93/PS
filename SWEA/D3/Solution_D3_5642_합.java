import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5642_합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int tc=1;tc<=T;tc++){
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0;i<N;i++)
                arr[i] = Integer.parseInt(st.nextToken());

            int[] dp = new int[N];
            dp[0] = arr[0];

            int max = dp[0];
            for(int i=1;i<N;i++){
                dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
                max = Math.max(max, dp[i]);
            }

            sb.append("#" + tc + " " + max + "\n");
        }

        System.out.print(sb.toString().trim());
    }
}