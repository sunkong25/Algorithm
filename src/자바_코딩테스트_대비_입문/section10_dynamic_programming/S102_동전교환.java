package 자바_코딩테스트_대비_입문.section10_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class S102_동전교환 {
	static int n, m;
	static int[] coin, dy;

	public int solution() {
		dy = new int[m + 1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = coin[i]; j <= m; j++) {
				dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
			}
		}

		return dy[m];
	}
	public static void main(String[] args) {
		S102_동전교환 T = new S102_동전교환();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		m = sc.nextInt();
		System.out.println(T.solution());
	}
}
