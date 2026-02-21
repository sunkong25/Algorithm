package 자바_코딩테스트_대비_입문.section06_sorting_and_searching;

import java.util.Scanner;

public class P49_버블정렬 {
	public int[] solution(int n, int[] arr) {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		P49_버블정렬 T = new P49_버블정렬();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
