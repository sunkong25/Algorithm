package 자바_코딩테스트_대비_입문.array;

import java.util.Scanner;

public class P17_보이는학생 {
	public int solution(int n, int[] student) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (student[i] > max) {
				answer++;
				max = student[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		P17_보이는학생 T = new P17_보이는학생();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] student = new int[n];
		for (int i = 0; i < n; i++) {
			student[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, student));
	}
}
