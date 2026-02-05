package 자바_코딩테스트_it_대기업_유제.section05_sorting_thinking;

import java.util.ArrayList;

public class P26_모임장소 {
	public int solution(int[][] board) {
		int answer = Integer.MAX_VALUE;
		int n = board.length;

		ArrayList<Integer[]> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					a.add(new Integer[] {i, j});
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int sum = 0;
				for (int k = 0; k < a.size(); k++) {
					sum += Math.abs(i - a.get(k)[0]) + Math.abs(j - a.get(k)[1]);
				}
				answer = Math.min(answer, sum);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		P26_모임장소 T = new P26_모임장소();
		System.out.println(T.solution(
				new int[][]{{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}}));
		System.out.println(T.solution(
				new int[][]{{1, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}}));
		System.out.println(T.solution(
				new int[][]{{1, 0, 0, 0, 1, 1}, {0, 1, 0, 0, 1, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0},
						{0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 1, 1}}));
	}
}
