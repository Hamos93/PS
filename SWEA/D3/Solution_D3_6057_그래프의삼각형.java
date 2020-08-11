import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution_D3_6057_그래프의삼각형 {
    private static int[][] graph;
    private static boolean[] visit;
    private static int cnt, N;
     
    private static void dfs(int node, int len, int start) {
        // 3개의 정점 방문 시, 삼각형 확인
        if(len == 3) {
            if(graph[node][start] == 1) cnt++;
             
            return;
        }
         
        // i < j < k
        for(int next=node+1;next<=N;next++) {
            if(graph[node][next] == 1 && !visit[next]) {
                visit[next] = true;
                 
                dfs(next, len + 1, start);
                 
                visit[next] = false;
            }
        }
    }
     
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
        int T = Integer.parseInt(st.nextToken());
        for(int tc=1;tc<=T;tc++) {
            st = new StringTokenizer(br.readLine(), " ");
             
            N = Integer.parseInt(st.nextToken());
            graph = new int[N+1][N+1];
            visit = new boolean[N+1];
             
            int M = Integer.parseInt(st.nextToken());
             
            // 그래프 입력
            while(0 < M--) {
                st = new StringTokenizer(br.readLine(), " ");
                 
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                 
                graph[x][y] = graph[y][x] = 1;
            }
             
            cnt = 0;
            for(int i=1;i<=N;i++) {
                visit[i] = true;
                 
                dfs(i, 1, i);
                 
                visit[i] = false;
            }
             
            System.out.println("#" + tc + " " + cnt);
        }
    }
}