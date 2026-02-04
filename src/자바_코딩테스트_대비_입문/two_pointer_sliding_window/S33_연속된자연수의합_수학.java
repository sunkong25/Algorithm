package 자바_코딩테스트_대비_입문.two_pointer_sliding_window;

import java.util.Scanner;

public class S33_연속된자연수의합_수학 {
	public int solution(int n) {
		int answer = 0;
		int cnt = 1;
		n--;
		while (n > 0) {
			cnt++;
			n = n - cnt; //연속된 자연수 점점 빼기
			if(n % cnt == 0) answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		S33_연속된자연수의합_수학 T = new S33_연속된자연수의합_수학();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
