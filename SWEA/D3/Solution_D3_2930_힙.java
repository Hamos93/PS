import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class Solution_D3_2930_힙 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
        int T = Integer.parseInt(st.nextToken());
         
        StringBuilder sb = new StringBuilder();
        for(int tc=1;tc<=T;tc++) {
            sb.append("#" + tc + " ");
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
             
            st = new StringTokenizer(br.readLine(), " ");
             
            int N = Integer.parseInt(st.nextToken());
            while(0 < N--) {
                st = new StringTokenizer(br.readLine(), " ");
                 
                int flag = Integer.parseInt(st.nextToken());
                 
                if(flag == 1) pq.offer(Integer.parseInt(st.nextToken()));
                else {
                    if(!pq.isEmpty()) sb.append(pq.poll() + " ");
                    else sb.append("-1 ");
                }
            }
             
            sb.append("\n");
        }
         
        System.out.print(sb.toString().trim());
    }
}