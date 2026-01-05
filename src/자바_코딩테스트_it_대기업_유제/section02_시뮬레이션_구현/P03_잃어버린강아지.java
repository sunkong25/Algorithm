package 자바_코딩테스트_it_대기업_유제.section02_시뮬레이션_구현;

class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class P03_잃어버린강아지 {

	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static Point dog, person;

	public int solution(int[][] board) {
		int answer = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (board[i][j] == 2) {
					person = new Point(i, j);
				}
				if (board[i][j] == 3) {
					dog = new Point(i, j);
				}
			}
		}

		int dd = 0, dp = 0;

		while (true) {
			if(person.x == dog.x && person.y == dog.y) break;
			if (answer > 10000) {
				return 0;
			}
			int nxP = person.x + dx[dp];
			int nyP = person.y + dy[dp];

			int nxD = dog.x + dx[dd];
			int nyD = dog.y + dy[dd];

			if (nxP < 0 || nxP >= 10 || nyP < 0 || nyP >= 10 || board[nxP][nyP] == 1) {
				dp = (dp + 1) % 4;
			} else {
				person.x = nxP;
				person.y = nyP;
			}

			if (nxD < 0 || nxD >= 10 || nyD < 0 || nyD >= 10 || board[nxD][nyD] == 1) {
				dd = (dd + 1) % 4;
			} else {
				dog.x = nxD;
				dog.y = nyD;
			}
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		P03_잃어버린강아지 T = new P03_잃어버린강아지();
		int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
				{1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
				{0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
		System.out.println(T.solution(arr1));
		int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
				{0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
				{1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
				{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
		System.out.println(T.solution(arr2));
	}
}
