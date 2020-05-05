import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Univ {
	String name;
	int alcohol;
	
	public Univ(String name, int alcohol){
		this.name = name;
		this.alcohol = alcohol;
	}
}

public class Main_백준_11557_YangjojangofTheYear {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine());
			List<Univ> list = new ArrayList<>();
			
			int N = Integer.parseInt(st.nextToken());
			while(N-- > 0){
				st = new StringTokenizer(br.readLine(), " ");
				
				list.add(new Univ(st.nextToken(), Integer.parseInt(st.nextToken())));
			}
			
			Collections.sort(list, new Comparator<Univ>() {
				@Override
				public int compare(Univ o1, Univ o2) {
					if(o1.alcohol > o2.alcohol) return 1;

					return -1;
				}
			});

			System.out.println(list.get(list.size() - 1).name);
		}
	}
}