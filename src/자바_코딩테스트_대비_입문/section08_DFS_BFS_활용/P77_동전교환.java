package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P77_동전교환 {
	static Integer min = Integer.MAX_VALUE, n, m;
	public static Integer[] c;

	public void DFS(int L, int sum) {
		if (sum > m) return;
		if (min <= L) return;
		if (m == sum) {
			min = Math.min(min, L);
		} else {
			for (int i = 0; i < n; i++) {
				DFS(L + 1, sum + c[i]);
			}
		}
	}

	public static void main(String[] args) {
		P77_동전교환 T = new P77_동전교환();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		c = new Integer[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c, Collections.reverseOrder());
		m = sc.nextInt();

		T.DFS(0, 0);
		System.out.println(min);
	}
}
