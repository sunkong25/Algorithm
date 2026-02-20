package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S45_공주구하기 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		while (!q.isEmpty()) {
			for (int i = 1; i < k; i++) {
				q.offer(q.poll());
			}
			q.poll();
			if (q.size() == 1) {
				answer = q.poll();
			}
		}

		return answer;
	}
	public static void main(String[] args){
		S45_공주구하기 T = new S45_공주구하기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(T.solution(n, k));
	}
}
