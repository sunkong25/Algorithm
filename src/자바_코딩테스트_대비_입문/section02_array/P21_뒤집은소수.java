package 자바_코딩테스트_대비_입문.section02_array;

import java.util.ArrayList;
import java.util.Scanner;

public class P21_뒤집은소수 {
	public int[] solution(int n, int[] input) {
		int[] answer = {};
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int reverse = 0;
			while (input[i] != 0) {
				int digit = input[i] % 10;
				reverse = reverse * 10 + digit;
				input[i] /= 10;
			}
			input[i] = reverse;
			max = Math.max(input[i], max);
		}
		ArrayList<Integer> a = new ArrayList<>();
		int[] v = new int[max + 1];
		v[0] = 1;
		v[1] = 1;
		for (int i = 2; i < v.length; i++) {
			if (v[i] == 0) {
				for (int j = i; j < v.length; j = j + i) {
					v[j] = 1;
				}
				v[i] = 0;
			}

		}

		for (int i = 0; i < input.length; i++) {
			if (v[input[i]] == 0) {
				a.add(input[i]);
			}
		}

		answer = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			answer[i] = a.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		P21_뒤집은소수 T = new P21_뒤집은소수();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}

		for (int x : T.solution(n, input)) {
			System.out.print(x + " ");
		}
	}
}
