import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_백준_2581_소수 {
	private static boolean isPrime(int num){
		if(num == 1) return false;
		
		boolean flag = true;
		for(int i=2;i<=num-1;i++)
			if(num % i == 0) flag = false;
		
		return flag;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
	
		List<Integer> list = new ArrayList<>();
		for(int i=M;i<=N;i++)
			if(isPrime(i)) list.add(i);
		
		if(list.size() == 0) {
			System.out.print("-1");
			return;
		}
	
		int sum = 0;
		for(int i=0;i<list.size();i++)
			sum += list.get(i);
		
		System.out.print(sum + "\n" + list.get(0));
	}
}