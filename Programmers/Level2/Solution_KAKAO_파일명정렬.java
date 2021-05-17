import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_KAKAO_파일명정렬 {
	public static String[] solution(String[] files) {
		String[] answer = new String[files.length];
		
		List<String[]> list = new ArrayList<>();
		for(int i=0;i<files.length;i++) {
			String file = files[i];
			
			int start = -1, end = -1;
			for(int j=0;j<file.length();j++) {
				if(0 <= file.charAt(j) - '0' && file.charAt(j) - '0' <= 9) {
					start = j;
					break;
				}
			}
			
			int standard = 0;

			if(file.length() - 1 < start + 4) standard = file.length() - 1;
			else standard = start + 4;
			
			for(int j=start;j<=standard;j++) {
				if(0 <= file.charAt(j) - '0' && file.charAt(j) - '0' <= 9) end = j;
				else break;
			}
		
			String HEAD = file.substring(0, start).toUpperCase();
			String NUMBER = file.substring(start, end + 1);
			
			list.add(new String[] { file, HEAD, NUMBER, Integer.toString(i + 1) });
		}
		
		Collections.sort(list, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(0 < o1[1].compareTo(o2[1])) return 1;
				else if(o1[1].compareTo(o2[1]) == 0) {
					int value1 = Integer.parseInt(o1[2]);
					int value2 = Integer.parseInt(o2[2]);
					
					if(value2 < value1) return 1;
					else if(value1 == value2) {
						if(Integer.parseInt(o2[3]) < Integer.parseInt(o1[3])) return 1;
					}
				}
				
				return -1;
			}
		});

		for(int i=0;i<list.size();i++)
			answer[i] = list.get(i)[0];
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" })));
		System.out.println(Arrays.toString(solution(new String[] { "F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat" })));
	}
}