package 자바_코딩테스트_it_대기업_유제.section02_시뮬레이션_구현;

import java.util.Arrays;

public class P01_사다리타기 {
	public char[] solution(int n, int[][] ladder) {
		char[] answer = new char[n];
		char[][] l = new char[ladder.length + 1][n + 1];

		for (int i = 0; i < n; i++) {
			l[0][i+1] = (char) ('A' + i);
		}

		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				l[i+1][ladder[i][j]] = 's';
				l[i+1][ladder[i][j] + 1] = 'e';
			}
		}

		for (int i = 1; i <= n; i++) {
			int location = i;
			for (int j = 1; j <= ladder.length; j++) {
				if (l[j][location] == 's') {
					location++;
				} else if (l[j][location] == 'e') {
					location--;
				}
			}
			answer[location-1] = l[0][i];
		}
		return answer;
	}

	public static void main(String[] args) {
		P01_사다리타기 T = new P01_사다리타기();
		System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
		System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
		System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
		System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
	}
}
