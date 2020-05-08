import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution_D3_1206_View {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
         
        for(int tc=1;tc<=10;tc++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
         
            int[] building = new int[N];
             
            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0;i<N;i++)
                building[i] = Integer.parseInt(st.nextToken());
             
            int cnt = 0;
            for(int i=2;i<N-1;i++) {
                while(building[i-2] < building[i] && building[i-1] < building[i] 
                        && building[i+2] < building[i] && building[i+1] < building[i]) {
                    cnt++;
                    building[i]--;
                }
            }
             
            System.out.println("#" + tc + " " + cnt);
        }
    }
}