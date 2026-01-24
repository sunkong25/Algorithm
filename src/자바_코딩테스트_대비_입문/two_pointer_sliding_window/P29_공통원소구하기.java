package 자바_코딩테스트_대비_입문.two_pointer_sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P29_공통원소구하기 {
	public ArrayList<Long> solution(int n, int m, Long[] a, Long[]b) {
		ArrayList<Long> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1 = 0, p2 = 0;
		while (p1 < n && p2 < m) {
			if (a[p1] < b[p2]) {
				p1++;
			} else if (a[p1] > b[p2]) {
				p2++;
			} else {
				answer.add(a[p1]);
				p1++;
				p2++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		P29_공통원소구하기 T = new P29_공통원소구하기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Long[] a = new Long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		int m = sc.nextInt();
		Long[] b = new Long[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}

		for (Long x : T.solution(n, m, a, b)) {
			System.out.print(x + " ");
		}
	}
}
