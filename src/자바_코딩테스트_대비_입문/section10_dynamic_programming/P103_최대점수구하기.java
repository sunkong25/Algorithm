package 자바_코딩테스트_대비_입문.section10_dynamic_programming;

import java.util.Scanner;

public class P103_최대점수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] dy = new int[m+1];

		for (int i = 0; i < n; i++) {
			int ps = sc.nextInt();
			int pt = sc.nextInt();
			for (int j = m; j >= pt; j--) {
				dy[j] = Math.max(dy[j], dy[j - pt] + ps);
			}
		}
		System.out.println(dy[m]);
	}
}
