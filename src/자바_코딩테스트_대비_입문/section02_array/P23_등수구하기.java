package 자바_코딩테스트_대비_입문.section02_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P23_등수구하기 {
	public int[] solution(int n, int[] score) {
		int[] answer = new int[n + 1];
		Integer[] s = new Integer[n + 1];
		s[0] = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			s[i] = score[i];
		}
		Arrays.sort(s, Collections.reverseOrder());
		int tmp = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (s[j].equals(score[i])) {
					if (s[j - 1].equals(s[j])) {
						answer[i] = tmp;
					} else {
						answer[i] = j;
						tmp = j;
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		P23_등수구하기 T = new P23_등수구하기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] score = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			score[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(T.solution(n, score)[i] + " ");
		}
	}
}
