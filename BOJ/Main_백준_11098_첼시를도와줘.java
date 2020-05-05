import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Player {
	long price;
	String name;
	
	public Player(long price, String name){
		this.price = price;
		this.name = name;
	}
}

public class Main_백준_11098_첼시를도와줘 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		while(n-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int p = Integer.parseInt(st.nextToken());
			List<Player> list = new ArrayList<>();
			while(p-- > 0){
				st = new StringTokenizer(br.readLine(), " ");
				list.add(new Player(Long.parseLong(st.nextToken()), st.nextToken()));
			}
			
			Collections.sort(list, new Comparator<Player>() {
				@Override
				public int compare(Player o1, Player o2) {
					if(o1.price < o2.price) return 1;
					
					return -1;
				}
			});
			
			System.out.println(list.get(0).name);
		}
	}
}