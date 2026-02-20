package 자바_코딩테스트_대비_입문.section06_sorting_and_searching;

import java.util.Arrays;
import java.util.Scanner;

public class P48_선택정렬 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			int min = arr[i];
			int idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					idx = j;
				}
			}

			arr[idx] = arr[i];
			arr[i] = min;
		}
		answer = arr;
		return answer;
	}

	public static void main(String[] args) {
		P48_선택정렬 T = new P48_선택정렬();
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
