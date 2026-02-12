package 자바_코딩테스트_it_대기업_유제.section07_dfs;

import java.util.Arrays;

public class P36_줄다리기 {
	int[] ch;
	int[][] board;
	int answer, m;

	public void DFS(int L, int pre) {
		if (L == m) {
			answer++;
		} else {
			for (int i = 1; i <= m; i++) {
				if (ch[i] == 0 && board[i][pre] == 0) {
					ch[i] = 1;
					DFS(L + 1, i);
					ch[i] = 0;
				}
			}
		}
	}
	public int solution(int[][] fight){
		answer = 0;
		m = 7;
		board = new int[8][8];
		ch = new int[8];
		for(int[] x : fight){
			board[x[0]][x[1]] = 1;
			board[x[1]][x[0]] = 1;
		}
		DFS(0, 0);

		return answer;
	}

	public static void main(String[] args){
		P36_줄다리기 T = new P36_줄다리기();
		System.out.println(T.solution(new int[][]{{1, 3}, {5, 7}, {4, 2}}));
		System.out.println(T.solution(new int[][]{{3, 2}, {3, 5}, {5, 2}, {7, 3}}));
		System.out.println(T.solution(new int[][]{{1, 2}, {1, 5}, {1, 7}, {1, 3}}));
		System.out.println(T.solution(new int[][]{{1, 7}}));
		System.out.println(T.solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
	}
}
