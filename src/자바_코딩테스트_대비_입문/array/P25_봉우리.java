package 자바_코딩테스트_대비_입문.array;

import java.util.Scanner;

public class P25_봉우리 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};

	public int solution(int n, int[][] input) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					if(input[i][j] <= input[i+dx[k]][j+dy[k]]){
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		P25_봉우리 T = new P25_봉우리();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] input = new int[n+2][n+2];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				input[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(n, input));
	}
}
