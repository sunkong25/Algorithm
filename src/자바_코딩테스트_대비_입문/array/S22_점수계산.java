package 자바_코딩테스트_대비_입문.array;

import java.util.Scanner;

public class S22_점수계산 {
	public int solution(int n, int[] input) {
		int answer = 0, cnt = 0;

		for (int i = 0; i < n; i++) {
			if (input[i] == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
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
