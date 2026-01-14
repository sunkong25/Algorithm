package 자바_코딩테스트_대비_입문.array;

import java.util.ArrayList;
import java.util.Scanner;

public class S21_뒤집은소수 {
	public boolean isPrime(int num) {
		if(num == 1) return false;
		for (int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	public ArrayList<Integer> solution(int n, int[] input) {
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int tmp = input[i];
			int reverse = 0;
			while(tmp > 0){
				int t = tmp % 10;
				reverse = reverse*10 + t;
				tmp = tmp / 10;
			}
			if (isPrime(reverse)) {
				answer.add(reverse);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		S21_뒤집은소수 T = new S21_뒤집은소수();
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
