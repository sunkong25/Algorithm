package 자바_코딩테스트_대비_입문.section02_array;

import java.util.Scanner;

public class S23_등수구하기 {
	public int[] solution(int n, int[] score) {
		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n; j++) {
				if(score[i] < score[j]) cnt++;
			}
			answer[i] = cnt;
		}
		return answer;
	}
	public static void main(String[] args) {
		S23_등수구하기 T = new S23_등수구하기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] score = new int[n];

		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}

		for (int x : T.solution(n, score)) {
			System.out.print(x + " ");
		}
	}
}
