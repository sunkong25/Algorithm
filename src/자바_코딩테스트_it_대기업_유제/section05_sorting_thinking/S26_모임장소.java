package 자바_코딩테스트_it_대기업_유제.section05_sorting_thinking;

import java.util.ArrayList;
import java.util.Collections;

public class S26_모임장소 {
	public int solution(int[][] board){
		int answer=0;
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> col = new ArrayList<>();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 1) {
					row.add(i);
					col.add(j);
				}
			}
		}

		int n = row.size() / 2;
		Collections.sort(col);

		int x = row.get(n);
		int y = col.get(n);

		for (int i = 0; i < row.size(); i++) {
			answer += Math.abs(x - row.get(i)) + Math.abs(y - col.get(i));
		}

		return answer;
	}

	public static void main(String[] args){
		S26_모임장소 T = new S26_모임장소();
		System.out.println(T.solution(new int[][]{{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}}));
		System.out.println(T.solution(new int[][]{{1, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}}));
		System.out.println(T.solution(new int[][]{{1, 0, 0, 0, 1, 1}, {0, 1, 0, 0, 1, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 1, 1}}));
	}
}
