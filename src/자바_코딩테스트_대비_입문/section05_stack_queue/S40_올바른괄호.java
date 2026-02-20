package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class S40_올바른괄호 {
	public String solution(String input) {
		String answer = "YES";
		Stack<Character> st = new Stack<>();

		for (char x : input.toCharArray()) {
			if (x == '(') {
				st.push(x);
			} else {
				if (st.isEmpty()) return "NO";
				st.pop();
			}
		}
		if(!st.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		P40_올바른괄호 T = new P40_올바른괄호();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
