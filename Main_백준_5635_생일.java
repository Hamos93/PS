import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Student {
	String name;
	int day;
	int month;
	int year;
	
	public Student(String name, int day, int month, int year){
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

public class Main_백준_5635_생일 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		List<Student> list = new ArrayList<>();
		
		while(n-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			list.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.year < o2.year) return 1;
				
				if(o1.year == o2.year){
					if(o1.month < o2.month) return 1;
				}
				
				if(o1.month == o2.month) {
					if(o1.day < o2.day) return 1;
				}
				
				return -1;
			}
		});

		System.out.print(list.get(0).name + "\n" + list.get(list.size()-1).name);
	}
}