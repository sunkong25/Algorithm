package 자바_코딩테스트_대비_입문.two_pointer_sliding_window;

import java.util.ArrayList;
import java.util.Scanner;

public class S28_두배열합치기 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0 , p2 = 0;
		while (p1 < n && p2 < m) {
			if (a[p1] < b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}
		while(p1 < n) answer.add(a[p1++]);
		while(p2 < m) answer.add(b[p2++]);
		return answer;
	}
	public static void main(String[] args) {
		S28_두배열합치기 T = new S28_두배열합치기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] num1 = new int[n];
		for (int i = 0; i < n; i++) {
			num1[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] num2 = new int[m];
		for (int i = 0; i < m; i++) {
			num2[i] = sc.nextInt();
		}

		for (int x : T.solution(n, m, num1, num2)) {
			System.out.print(x + " ");
		}
	}
}
