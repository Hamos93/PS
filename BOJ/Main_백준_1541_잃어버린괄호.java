import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1541_잃어버린괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");

        int result = 0;
        for(int i=0;i<input.length;i++){
            String[] expression = input[i].split("\\+");

            int value = 0;
            for(String str : expression)
                value += Integer.parseInt(str);

            if(i == 0) {
                result += value;
                continue;
            }

            result -= value;
        }

        System.out.print(result);
    }
}