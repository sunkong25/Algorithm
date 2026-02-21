package 자바_코딩테스트_대비_입문.section06_sorting_and_searching;

import java.util.Scanner;

public class S50_삽입정렬 {
	public int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int key = arr[i], j;
			for (j = i - 1; j >= 0; j--) {
				if (key < arr[j]) {
					arr[j + 1] = arr[j];
				} else break;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		S50_삽입정렬 T = new S50_삽입정렬();
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
