package 코딩테스트_대비_입문.Recursive_Tree_Graph;

import java.util.*;

public class P61_피보나치수열 {
	static int[] fibo;

	public int solution(int n) {
		if(fibo[n]>0){
			return fibo[n];
		}
		if (n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = solution(n - 2) + solution(n - 1);
		}
	}

	public static void main(String[] args) {
		P61_피보나치수열 T = new P61_피보나치수열();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n+1];
		T.solution(n);
		for (int i = 1; i < n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}
