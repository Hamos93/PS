import java.util.ArrayList;
import java.util.List;

public class Solution_L2_방문길이 {
    public static int solution(String dirs) {
        int y = 0, x = 0;
        
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<dirs.length();i++) {
        	char dir = dirs.charAt(i);
        	
        	int ny = y, nx = x;
        	
        	if(dir == 'U' && y + 1 <= 5) ny = y + 1;
        	else if(dir == 'D' && -5 <= y - 1) ny = y - 1;
        	else if(dir == 'L' && -5 <= x - 1) nx = x - 1;
        	else if(dir == 'R' && x + 1 <= 5) nx = x + 1;
        	else continue;
        	
        	boolean flag = true;
        	for(int[] pos : list) {
        		if((pos[0] == ny && pos[1] == nx && pos[2] == y && pos[3] == x) ||
        				(pos[0] == y && pos[1] == x && pos[2] == ny && pos[3] == nx)) {
        			flag = false;
        			break;
        		}
        	}
        	
        	if(flag) {
        		list.add(new int[] { ny, nx, y, x });
        		list.add(new int[] { y, x, ny, nx });
        	}
        
        	y = ny;
        	x = nx;
        }
    	
        return list.size() / 2;
    }
    
	public static void main(String[] args) {
		System.out.println(solution("ULURRDLLU"));
		System.out.println(solution("LULLLLLLU"));
		System.out.println(solution("UDU"));
	}
}