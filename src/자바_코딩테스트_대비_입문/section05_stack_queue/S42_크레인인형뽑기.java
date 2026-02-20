package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class S42_크레인인형뽑기 {
	public int solution(int n, int m, int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();

		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) {
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0;
					if (!st.isEmpty() && st.peek() == tmp) {
						answer += 2;
						st.pop();
					}
					else st.push(tmp);
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		S42_크레인인형뽑기 T = new S42_크레인인형뽑기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
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
