package 자바_코딩테스트_대비_입문.recursive_tree_graph;

import java.util.Scanner;

public class P59_재귀함수를이용한이진수출력 {
	public void DFS(int n) {
		if (n == 0) {
			return;
		}
		DFS(n / 2);
		System.out.println(n % 2);
	}

	public static void main(String[] args) {
		P59_재귀함수를이용한이진수출력 T = new P59_재귀함수를이용한이진수출력();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		T.DFS(num);
	}
}
