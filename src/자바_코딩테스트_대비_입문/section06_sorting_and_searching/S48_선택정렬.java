package 자바_코딩테스트_대비_입문.section06_sorting_and_searching;

import java.util.Scanner;

public class S48_선택정렬 {
	public int[] solution(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[idx]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		S48_선택정렬 T = new S48_선택정렬();
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
