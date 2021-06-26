import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_21921_블로그 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] day = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;
        for(int i=0;i<N;i++){
            day[i] = Integer.parseInt(st.nextToken());

            if(i < X) sum += day[i];
        }

        int max = sum, cnt = 1;
        for(int i=0;i<N-X;i++){
            sum -= day[i];
            sum += day[i + X];

            if(max <= sum){
                if(sum == max) cnt++;
                else cnt = 1;

                max = sum;
            }
        }

        if(max == 0) System.out.print("SAD");
        else System.out.print(max + "\n" + cnt);
    }
}