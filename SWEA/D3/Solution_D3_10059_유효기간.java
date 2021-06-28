import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_10059_유효기간 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int tc=1;tc<=T;tc++){
            String input = br.readLine();

            String str1 = "", str2 = "";
            str1 += input.charAt(0);
            str1 += input.charAt(1);
            str2 += input.charAt(2);
            str2 += input.charAt(3);

            int date1 = Integer.parseInt(str1), date2 = Integer.parseInt(str2);
            boolean MMYY = false, YYMM = false;

            if(1 <= date1 && date1 <= 12) {
                if (1 <= date2 && date2 <= 12) MMYY = YYMM = true;
                else MMYY = true;
            }else{
                if(1 <= date2 && date2 <= 12) YYMM = true;
            }

            sb.append("#" + tc + " ");
            if(MMYY && YYMM) sb.append("AMBIGUOUS\n");
            else if(MMYY && !YYMM) sb.append("MMYY\n");
            else if(!MMYY && YYMM) sb.append("YYMM\n");
            else sb.append("NA\n");
        }

        System.out.print(sb.toString().trim());
    }
}