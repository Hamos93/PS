import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1063_킹 {
	public static boolean isRange(int x, int y, int dx, int dy) {
		int nx = x + dx;
		int ny = y + dy;

		if(1 <= nx && nx <= 8 && 1 <= ny && ny <= 8) return true;
		else return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String pos1 = st.nextToken();
		int kingY = (int)(pos1.charAt(0)) - 64;
		int kingX = pos1.charAt(1) - '0';

		String pos2 = st.nextToken();
		int stoneY = (int)(pos2.charAt(0)) - 64;
		int stoneX = pos2.charAt(1) - '0';

		int N = Integer.parseInt(st.nextToken());
		while(0 < N--) {
			String dir = br.readLine();
			boolean flag = false;

			switch (dir) {
			case "B":
				flag = isRange(kingX, kingY, -1, 0);
				if(flag) {
					if(kingX - 1 == stoneX && kingY == stoneY) {
						if(isRange(stoneX, stoneY, -1, 0)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += -1;
							stoneY += 0;
						}
					}else {
						kingX += -1;
						kingY += 0;
					}
				}

				break;
			case "T":
				flag = isRange(kingX, kingY, 1, 0);
				if(flag) {
					if(kingX + 1 == stoneX && kingY == stoneY) {
						if(isRange(stoneX, stoneY, 1, 0)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += 1;
							stoneY += 0;
						}
					}else {
						kingX += 1;
						kingY += 0;
					}
				}

				break;
			case "L":
				flag = isRange(kingX, kingY, 0, -1);
				if(flag) {
					if(kingX == stoneX && kingY - 1 == stoneY) {
						if(isRange(stoneX, stoneY, 0, -1)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += 0;
							stoneY += -1;
						}
					}else {
						kingX += 0;
						kingY += -1;
					}
				}

				break;
			case "R":
				flag = isRange(kingX, kingY, 0, 1);
				if(flag) {
					if(kingX == stoneX && kingY + 1 == stoneY) {
						if(isRange(stoneX, stoneY, 0, 1)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += 0;
							stoneY += 1;
						}
					}else {
						kingX += 0;
						kingY += 1;
					}
				}

				break;
			case "RT":
				flag = isRange(kingX, kingY, 1, 1);
				if(flag) {
					if(kingX + 1 == stoneX && kingY + 1 == stoneY) {
						if(isRange(stoneX, stoneY, 1, 1)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += 1;
							stoneY += 1;
						}
					}else {
						kingX += 1;
						kingY += 1;
					}
				}

				break;
			case "RB":
				flag = isRange(kingX, kingY, -1, 1);
				if(flag) {
					if(kingX -1 == stoneX && kingY + 1 == stoneY) {
						if(isRange(stoneX, stoneY, -1, 1)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += -1;
							stoneY += 1;
						}
					}else {
						kingX += -1;
						kingY += 1;
					}
				}

				break;
			case "LT":
				flag = isRange(kingX, kingY, 1, -1);
				if(flag) {
					if(kingX + 1 == stoneX && kingY - 1 == stoneY) {
						if(isRange(stoneX, stoneY, 1, -1)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += 1;
							stoneY += -1;
						}
					}else {
						kingX += 1;
						kingY += -1;
					}
				}

				break;
			case "LB":
				flag = isRange(kingX, kingY, -1, -1);
				if(flag) {
					if(kingX - 1 == stoneX && kingY - 1 == stoneY) {
						if(isRange(stoneX, stoneY, -1, -1)) {
							kingX = stoneX;
							kingY = stoneY;

							stoneX += -1;
							stoneY += -1;
						}
					}else {
						kingX += -1;
						kingY += -1;
					}
				}

				break;
			}
		}
		
		char resKingY = (char)(kingY + 64);
		char resStoneY = (char)(stoneY + 64);

		StringBuilder sb = new StringBuilder();
		sb.append(resKingY).append(kingX).append("\n").append(resStoneY).append(stoneX);
		
		System.out.print(sb.toString());
	}
}