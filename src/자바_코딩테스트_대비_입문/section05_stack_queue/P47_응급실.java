package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Order {
	public int idx, c;

	public Order(int idx, int c) {
		this.idx = idx;
		this.c = c;
	}
}

public class P47_응급실 {
	public int solution(int n, int m, int[] patient) {
		int answer = 0;
		Queue<Order> Q = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			Q.offer(new Order(i, patient[i]));
		}


		while (!Q.isEmpty()) {
			boolean flag = true;
			Order o = Q.poll();
			for (Order q : Q) {
				if (o.c < q.c) {
					Q.offer(o);
					flag = false;
					break;
				}
			}
			if (flag) {
				answer++;
				if (o.idx == m) {
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		P47_응급실 T = new P47_응급실();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] patient = new int[n];

		for (int i = 0; i < n; i++) {
			patient[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, m, patient));
	}
}
