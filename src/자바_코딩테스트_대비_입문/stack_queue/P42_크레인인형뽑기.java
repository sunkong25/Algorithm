package 자바_코딩테스트_대비_입문.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class P42_크레인인형뽑기 {
	public int solution(int n, int m, int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < m; i++) {
			for (int j = 1; j <= n; j++) {
				int move = board[j][moves[i]];
				if (move != 0) {
					if (!st.isEmpty() && st.peek() == move) {
						board[j][moves[i]] = 0;
						st.pop();
						answer = answer + 2;
					} else {
						st.push(move);
						board[j][moves[i]] = 0;
					}
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		P42_크레인인형뽑기 T = new P42_크레인인형뽑기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] board = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int m = sc.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, m, board, moves));
	}
}
