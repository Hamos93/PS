import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Solution_D3_5986_새샘이와세소수_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
         
        boolean[] prime = new boolean[1000];
        prime[0] = true; prime[1] = true;
         
        for(int i=2;i<=999;i++) {
            if(!prime[i]) {
                for(int j=i+i;j<=999;j+=i)
                    if(!prime[j]) prime[j] = true;
            }
        }
         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
        int T = Integer.parseInt(st.nextToken());
        for(int tc=1;tc<=T;tc++) {
            st = new StringTokenizer(br.readLine(), " ");
         
            int N = Integer.parseInt(st.nextToken());
             
            List<Integer> list = new ArrayList<>();
            for(int i=2;i<=N;i++)
                if(!prime[i]) list.add(i);
             
            int len = list.size();
            int cnt = 0;
             
            for(int i=0;i<len;i++) {
                for(int j=i;j<len;j++) {
                    if(N <= list.get(i) + list.get(j)) break;
                    for(int k=j;k<len;k++) {
                        if(list.get(i) + list.get(j) + list.get(k) == N) cnt++;
                    }
                }
            }
 
            sb.append("#" + tc + " " + cnt + "\n");
        }
         
        System.out.print(sb.toString());
    }
}