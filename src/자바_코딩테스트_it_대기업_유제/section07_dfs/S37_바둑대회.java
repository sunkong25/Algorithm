package 자바_코딩테스트_it_대기업_유제.section07_dfs;

import java.util.ArrayList;

public class S37_바둑대회 {
	int answer, n;
	int[] ch;

	public void DFS(int L, int s, int[][] cans) {
		if (L == n / 2) {
			ArrayList<Integer> w = new ArrayList<>();
			ArrayList<Integer> b = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				if (ch[i] == 1) w.add(i);
				else b.add(i);
			}

			int sumW = 0, sumB = 0;
			for (int i = 0; i < L; i++) {
				sumW += cans[w.get(i)][0];
				sumB += cans[b.get(i)][1];
			}

			answer = Math.min(answer, Math.abs(sumW - sumB));
		} else {
			for (int i = s; i < n; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					DFS(L + 1, i + 1, cans);
					ch[i] = 0;
				}
			}
		}
	}
	public int solution(int[][] cans){
		answer = Integer.MAX_VALUE;
		n = cans.length;
		ch = new int[n];
		DFS(0, 0, cans);
		return answer;
	}

	public static void main(String[] args){
		S37_바둑대회 T = new S37_바둑대회();
		System.out.println(T.solution(new int[][]{{87, 84}, {66, 78}, {94, 94}, {93, 87}, {72, 92}, {78, 63}}));
		System.out.println(T.solution(new int[][]{{10, 20}, {15, 25}, {35, 23}, {55, 20}}));
		System.out.println(T.solution(new int[][]{{11, 27}, {16, 21}, {35, 21}, {52, 21}, {25, 33},{25, 32}, {37, 59}, {33, 47}}));
	}
}
