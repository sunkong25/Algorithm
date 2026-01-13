package 자바_코딩테스트_대비_입문.array;

import java.util.Scanner;

public class P20_소수 {
	public int solution(int n) {
		int answer = 0;
		int[] num = new int[n + 1];

		for (int i = 2; i <=n ; i++) {
			if (num[i] == 0) {
				answer++;
				for (int j = i; j <= n; j = j + i) {
					num[j] = 1;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		P20_소수 T = new P20_소수();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
