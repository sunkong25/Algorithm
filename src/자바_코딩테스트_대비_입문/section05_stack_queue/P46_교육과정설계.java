package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P46_교육과정설계 {
	public String solution(String a1, String a2) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		ArrayList<Character> c = new ArrayList<>();
		for (char x : a2.toCharArray()) {
			q.offer(x);
		}

		for (char x : a1.toCharArray()) {
			c.add(x);
		}

		int i = 0;
		if (q.containsAll(c)) {
			while (!q.isEmpty()) {
				if (i < c.size() && c.get(i) == q.peek()) {
					i++;
				}
				q.poll();
			}
		}
		if(i != c.size()) answer = "NO";

		return answer;
	}
	public static void main(String[] args) {
		P46_교육과정설계 T = new P46_교육과정설계();
		Scanner sc = new Scanner(System.in);

		String a1 = sc.next();
		String a2 = sc.next();

		System.out.println(T.solution(a1, a2));
	}
}
