package 자바_코딩테스트_it_대기업_유제.section02_시뮬레이션_구현;

import java.util.Arrays;

public class S07_비밀번호 {
	public int solution(int[] keypad, String password) {
		int answer = 0;
		int[][] pad = new int[3][3];
		int[][] dist = new int[10][10];
		char[] p = password.toCharArray();
		int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
		int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

		for (int i = 0; i < keypad.length; i++) {
			Arrays.fill(dist[i + 1], 2);
			pad[i / 3][i % 3] = keypad[i];
			dist[i + 1][i + 1] = 0;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 8; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];

					if (nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
						dist[pad[i][j]][pad[nx][ny]] = 1;
					}
				}
			}
		}

		for (int i = 0; i < p.length - 1; i++) {
			/*int pw1 = Character.getNumericValue(p[i]);
			int pw2 = Character.getNumericValue(p[i+1]);*/
			int pw1 = (int) password.charAt(i) - 48;
			int pw2 = (int) password.charAt(i+1) - 48;
			answer += dist[pw1][pw2];
		}

		return answer;
	}

	public static void main(String[] args) {
		S07_비밀번호 T = new S07_비밀번호();
		System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
		System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
}
