package 자바_코딩테스트_it_대기업_유제.section02_시뮬레이션_구현;

import java.util.Arrays;

public class P02_청소 {
	public int[] solution(int[][] board, int k) {
		int[] answer = new int[2];
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		int t = 0;
		answer[0] = 0;
		answer[1] = 0;

		for (int i = 0; i < k; i++) {
			int nx = answer[0] + dx[t % 4];
			int ny = answer[1] + dy[t % 4];

			if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length && board[nx][ny] == 0) {
				answer[0] = nx;
				answer[1] = ny;
			} else {
				t++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		P02_청소 T = new P02_청소();
		int[][] arr1 = {{0, 0, 0, 0, 0},
				{0, 1, 1, 0, 0},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1},
				{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = {{0, 0, 0, 1, 0, 1},
				{0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 1},
				{1, 1, 0, 0, 1, 0},
				{0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = {{0, 0, 1, 0, 0},
				{0, 1, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{1, 0, 0, 0, 1},
				{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr3, 25)));

	}
}
