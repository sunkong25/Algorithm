package 자바_코딩테스트_대비_입문.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S46_교육과정설계 {
	public String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();

		for (char x : need.toCharArray()) {
			Q.offer(x);
		}
		for (char x : plan.toCharArray()) {
			if (Q.contains(x)) {
				if(x != Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		S46_교육과정설계 T = new S46_교육과정설계();
		Scanner sc = new Scanner(System.in);

		String need = sc.next();
		String plan = sc.next();

		System.out.println(T.solution(need, plan));
	}
}
