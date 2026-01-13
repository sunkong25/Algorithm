package 자바_코딩테스트_대비_입문.array;

import java.util.Scanner;

public class P18_가위바위보 {
	public char[] solution(int n, int[] a, int[] b) {
		char[] answer = new char[n];

		for (int i = 0; i < n; i++) {
			if (a[i] == 3 && b[i] == 1) {
				answer[i] = 'B';
			} else if (a[i] == 1 && b[i] == 3) {
				answer[i] = 'A';
			} else if (a[i] < b[i]) {
				answer[i] = 'B';
			} else if (a[i] > b[i]) {
				answer[i] = 'A';
			} else {
				answer[i] = 'D';
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		P18_가위바위보 T = new P18_가위바위보();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		for (char x : T.solution(n, a, b)) {
			System.out.println(x);
		}
	}
}
