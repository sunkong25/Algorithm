package 자바_코딩테스트_대비_입문.section03_two_pointer_sliding_window;

import java.util.Scanner;

public class P28_두배열합치기 {
	public int[] solution(int[] num1, int[] num2) {
		int[] answer = new int[num1.length + num2.length];
		int i = 0, j = 0;

		for (int k = 0; k < answer.length; k++) {
			if (i<num1.length && j<num2.length) {
				if (num1[i] < num2[j]) {
					answer[k] = num1[i];
					i++;
				} else if (num1[i] > num2[j]) {
					answer[k] = num2[j];
					j++;
				} else {
					answer[k] = num1[i];
					k++;
					i++;
					answer[k] = num2[j];
					j++;
				}
			} else if (i < num1.length) {
				answer[k] = num1[i];
				i++;
			} else if (j < num2.length) {
				answer[k] = num2[j];
				j++;
			}

		}

		return answer;
	}
	public static void main(String[] args) {
		P28_두배열합치기 T = new P28_두배열합치기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] num1 = new int[n];
		for (int i = 0; i < n; i++) {
			num1[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] num2 = new int[m];
		for (int i = 0; i < m; i++) {
			num2[i] = sc.nextInt();
		}

		for (int x : T.solution(num1, num2)) {
			System.out.print(x + " ");
		}
	}
}
