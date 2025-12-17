package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.ArrayList;
import java.util.Scanner;

public class P73_합이같은부분집합 {
	static int n;
	static int[] ch;
	static int tmp1;
	static int tmp0;
	static boolean answer;
	static int[] s;

	public void DFS(int L) {
		tmp0 = 0;
		tmp1 = 0;
		if (L == n + 1) {
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 1) {
					tmp1 += s[i];
				} else {
					tmp0 += s[i];
				}
			}
			if (tmp1 == tmp0) {
				answer = true;
			}
		} else {
			ch[L] = 1;
			DFS(L + 1);
			ch[L] = 0;
			DFS(L + 1);
		}
	}

	public static void main(String[] args) {
		P73_합이같은부분집합 T = new P73_합이같은부분집합();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = new int[n+1];
		ch = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			s[i] = sc.nextInt();
		}
		T.DFS(s[1]);
		if (answer) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
