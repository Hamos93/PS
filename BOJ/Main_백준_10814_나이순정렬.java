import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class User {
	int age;
	String name;
	int idx;
	
	public User(int age, String name, int idx){
		this.age = age;
		this.name = name;
		this.idx = idx;
	}
}

public class Main_백준_10814_나이순정렬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		List<User> list = new ArrayList<>();
		int idx = 1;
		
		while(N-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			list.add(new User(age, name, idx++));
		}
		
		Collections.sort(list, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				if(o2.age < o1.age) return 1;
				
				if(o1.age == o2.age) {
					if(o1.idx > o2.idx) return 1;
				}
				
				return -1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++)
			sb.append(list.get(i).age + " " + list.get(i).name + "\n");
		
		System.out.print(sb.toString());
	}
}