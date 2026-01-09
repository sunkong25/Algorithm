package 자바_코딩테스트_대비_입문.array;

import java.util.Scanner;

public class P16_큰수출력하기 {
	public void solution(int n, int[] arr) {
		for (int i = 1; i <= n; i++) {
			if (arr[i - 1] < arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		P16_큰수출력하기 T = new P16_큰수출력하기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n+1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		T.solution(n, arr);
	}
}

