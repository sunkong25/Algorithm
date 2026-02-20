package 자바_코딩테스트_대비_입문.section04_hashmap_treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P39_K번째큰수 {
	public int solution(int n, int k, int[] arr) {
		TreeSet<Integer> t = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int v = j+1; v < n; v++) {
					t.add(arr[i] + arr[j] + arr[v]);
				}
			}
		}

		int cnt = 0;
		for (int x : t) {
			cnt++;
			if (cnt == k) return x;
		}

		return -1;
	}

	public static void main(String[] args) {
		P39_K번째큰수 T = new P39_K번째큰수();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, k, arr));
	}
}
