package 자바_코딩테스트_대비_입문.array;

import java.util.Scanner;

public class P22_점수계산 {
	public int solution(int n, int[] input) {
		int answer = 0;
		int[] score = new int[n];

		if (input[0] == 1) {
			score[0] = 1;
		}
		for (int i = 1; i < n; i++) {
			if (input[i] == 1) {
				if (score[i - 1] != 0) {
					score[i] = score[i - 1] + 1;
					continue;
				}
				score[i] = 1;
			}
		}

		for (int x : score) {
			answer += x;
		}
		return answer;
	}

	public static void main(String[] args) {
		P22_점수계산 T = new P22_점수계산();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] input = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, input));
	}
}
