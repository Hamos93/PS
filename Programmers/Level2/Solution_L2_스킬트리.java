
public class Solution_L2_스킬트리 {
	public static int solution(String skill, String[] skill_trees) {
		int cnt = 0;
		for(int i=0;i<skill_trees.length;i++) {
			int idx = 0;
			boolean flag = true;

			for(int j=0;j<skill_trees[i].length();j++) {
				char ch = skill_trees[i].charAt(j);
				
				if(skill.indexOf(ch) == -1) continue;
				else {
					if(skill.charAt(idx) == ch) idx++;
					else {
						flag = false;
						break;
					}
				}
			}
			
			if(flag) cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));
	}
}