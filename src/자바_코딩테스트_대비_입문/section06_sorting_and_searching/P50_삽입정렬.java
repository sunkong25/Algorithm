package 자바_코딩테스트_대비_입문.section06_sorting_and_searching;

import java.util.Scanner;

public class P50_삽입정렬 {
	public int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];

			for (int j = 0; j < i; j++) {
				if (key < arr[j]) {
					for (int k = i; k > j; k--) {
						arr[k] = arr[k - 1];
					}
					arr[j] = key;
					break;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		P50_삽입정렬 T = new P50_삽입정렬();
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
