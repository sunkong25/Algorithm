package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.Scanner;

public class S78_순열구하기 {
	static int n, m;
	static int[] pm, ch;

	public void DFS(int L, int[] arr) {
		if (L == m) {
			for (int i : pm) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = 0; i < n; i++) {
				if (ch[i] == 0) {
					pm[L] = arr[i];
					ch[i] = 1;
					DFS(L + 1, arr);
					ch[i] = 0;
				}
			}
		}

	}

	public static void main(String[] args) {
		S78_순열구하기 T = new S78_순열구하기();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		pm = new int[m];
		ch = new int[n];
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		T.DFS(0, arr);
	}
}
