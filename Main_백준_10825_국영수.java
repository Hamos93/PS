import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Student {
	String name;
	
	int korea;
	int english;
	int math;
	
	public Student(String name, int korea, int english, int math) {
		this.name = name;
		this.korea = korea;
		this.english = english;
		this.math = math;
	}
}

public class Main_백준_10825_국영수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		List<Student> list = new ArrayList<>();
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String name = st.nextToken();
			int korean = Integer.parseInt(st.nextToken());
			int english = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			Student student = new Student(name, korean, english, math);
			list.add(student);
		}
		
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// 1. 국어점수가 감소하는 순서
				if(o1.korea < o2.korea) return 1;
				
				// 2. 국어점수가 같으면 영어점수가 감소하는 증가하는 순서
				if(o1.korea == o2.korea) {
					if(o1.english > o2.english) return 1;
				}
				
				// 3. 국어점수와 영어점수가 같으면 수학점수가 감소하는 순서
				if(o1.korea == o2.korea && o1.english == o2.english) {
					if(o1.math < o2.math) return 1;
				}
				
				// 4. 모든 점수가 같으면 이름이 사전순으로 증가하는 순서
				if(o1.korea == o2.korea && o1.english == o2.english && o1.math == o2.math) {
					return o1.name.compareTo(o2.name);
				}
				
				return -1;
			}
		});

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++)
			sb.append(list.get(i).name + "\n"); 
	
		System.out.print(sb.toString());
	}
}