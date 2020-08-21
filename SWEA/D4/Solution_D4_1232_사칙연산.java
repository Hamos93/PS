import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Node {
	double data;
	Node leftLink;
	Node rightLink;

	public void setData(double data) {
		this.data = data;
	}

	public void setData(double data, Node leftLink, Node rightLink) {
		this.data = data;
		this.leftLink = leftLink;
		this.rightLink = rightLink;
	}
}

public class Solution_D4_1232_사칙연산 {
	private static Node[] array;
	private static void postorder(Node root) {
		if(root.leftLink != null || root.rightLink != null) {
			postorder(root.leftLink);
			postorder(root.rightLink);

			if(root.data < 0) {
				double operand1 = root.leftLink.data, operand2 = root.rightLink.data;
				double result = 0.0;

				if(root.data == -1.0) result = operand1 + operand2;
				if(root.data == -2.0) result = operand1 - operand2;
				if(root.data == -3.0) result = operand1 * operand2;
				if(root.data == -4.0) result = operand1 / operand2;

				root.setData(result);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());

			array = new Node[N + 1];
			for(int i=1;i<=N;i++)
				array[i] = new Node();

			for(int i=1;i<=N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				st.nextToken();

				String data = st.nextToken();
				if(data.charAt(0) == '+' || data.charAt(0) == '-' || data.charAt(0) == '*' || data.charAt(0) == '/') {
					int leftLink = Integer.parseInt(st.nextToken());
					int rightLink = Integer.parseInt(st.nextToken());

					if(data.charAt(0) == '+') array[i].setData(-1.0, array[leftLink], array[rightLink]);
					if(data.charAt(0) == '-') array[i].setData(-2.0, array[leftLink], array[rightLink]);
					if(data.charAt(0) == '*') array[i].setData(-3.0, array[leftLink], array[rightLink]);
					if(data.charAt(0) == '/') array[i].setData(-4.0, array[leftLink], array[rightLink]);
				}else array[i].setData(Double.parseDouble(data));
			}

			postorder(array[1]);

			System.out.println("#" + tc + " " + (int)array[1].data);
		}
	}
}