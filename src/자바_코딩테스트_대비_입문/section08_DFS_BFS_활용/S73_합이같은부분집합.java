package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.Scanner;

public class S73_합이같은부분집합 {
	static int num, total = 0;
	static String answer = "NO";
	boolean flag = false;

	public void DFS(int L, int sum, int[] arr) {
		if (flag) {
			return;
		}
		if (total / 2 < sum) {
			return;
		}
		if (L == num) {
			if ((total - sum) == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) {
		S73_합이같은부분집합 T = new S73_합이같은부분집합();
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int[] arr = new int[num + 1];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
