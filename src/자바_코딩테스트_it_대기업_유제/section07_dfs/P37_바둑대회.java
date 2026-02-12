package 자바_코딩테스트_it_대기업_유제.section07_dfs;

import java.util.Arrays;

public class P37_바둑대회 {
	int answer, m;
	int[] ch, a1, a2;

	public void DFS(int L, int s, int[][] cans) {
		if (L == m / 2) {
			int w = 0, b = 0;
			int sumB = 0, sumW = 0;

			for (int i = 0; i < m; i++) {
				if (ch[i] == 1) {
					a1[w] = i;
					w++;
				} else {
					a2[b] = i;
					b++;
				}
			}

			for (int i = 0; i < m / 2; i++) {
				sumW += cans[a1[i]][0];
				sumB += cans[a2[i]][1];
			}

			answer = Math.min(answer, Math.abs(sumW - sumB));
		} else {
			for (int i = s; i < m; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					DFS(L + 1, i+1, cans);
					ch[i] = 0;
				}
			}
		}
	}

	public int solution(int[][] cans) {
		answer = Integer.MAX_VALUE;
		m = cans.length;
		ch = new int[m];
		a1 = new int[m / 2];
		a2 = new int[m / 2];
		DFS(0, 0, cans);

		return answer;
	}

	public static void main(String[] args) {
		P37_바둑대회 T = new P37_바둑대회();
		System.out.println(T.solution(new int[][]{{87, 84}, {66, 78}, {94, 94}, {93, 87}, {72, 92}, {78, 63}}));
		System.out.println(T.solution(new int[][]{{10, 20}, {15, 25}, {35, 23}, {55, 20}}));
		System.out.println(T.solution(
				new int[][]{{11, 27}, {16, 21}, {35, 21}, {52, 21}, {25, 33}, {25, 32}, {37, 59}, {33, 47}}));
	}
}
