import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_14469_소가길을건너간이유3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[0] < o1[0]) return 1;
                else if(o1[0] == o2[0]){
                    if(o2[1] < o1[1]) return 1;
                }

                return -1;
            }
        });

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            pq.offer(new int[] { a, b });
        }

        int second = 0;
        while(!pq.isEmpty()){
            int[] poll = pq.poll();

            if(poll[0] < second) second += poll[1];
            else second = poll[0] + poll[1];
        }

        System.out.print(second);
    }
}