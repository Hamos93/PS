import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_백준_3745_오름세 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			
			List<Integer> list = new ArrayList<>();
			list.add(0);
			
			while(0 < n--) {
				int value = sc.nextInt();
				
				if(list.get(list.size() - 1) < value) list.add(value);
				else {
					int low = 0, high = list.size() - 1;
					
					while(low < high) {
						int mid = (low + high) / 2;
						
						if(value <= list.get(mid)) high = mid;
						else low = mid + 1;
					}
					
					list.set(high, value);
				}
			}
			
			sb.append(list.size() - 1 + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}