package 자바_코딩테스트_it_대기업_유제.section07_dfs;

import java.util.Stack;

public class S36_줄다리기 {
	int answer, m;
	int[][] board;
	Stack<Integer> s;
	int[] ch;

	public void DFS(int L) {
		if(L == m) answer++;
		else{
			for (int i = 1; i <= m; i++) {
				if(!s.isEmpty() && board[s.peek()][i] == 1) continue;
				if(ch[i] == 0){
					ch[i] = 1;
					s.push(i);
					DFS(L + 1);
					ch[i] = 0;
					s.pop();
				}
			}
		}
	}
	public int solution(int[][] fight){
		answer = 0;
		m = 7;
		s = new Stack<>();
		ch = new int[m + 1];
		board = new int[m + 1][m + 1];

		for (int[] x : fight) {
			board[x[0]][x[1]] = 1;
			board[x[1]][x[0]] = 1;
		}
		DFS(0);

		return answer;
	}

	public static void main(String[] args){
		S36_줄다리기 T = new S36_줄다리기();
		System.out.println(T.solution(new int[][]{{1, 3}, {5, 7}, {4, 2}}));
		System.out.println(T.solution(new int[][]{{3, 2}, {3, 5}, {5, 2}, {7, 3}}));
		System.out.println(T.solution(new int[][]{{1, 2}, {1, 5}, {1, 7}, {1, 3}}));
		System.out.println(T.solution(new int[][]{{1, 7}}));
		System.out.println(T.solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
	}
}
