package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class P41_괄호문자제거 {
	public String solution(String input) {
		String answer = "";
		Stack<Character> st = new Stack<>();
		for (char x : input.toCharArray()) {
			if (x == ')') {
				while (st.pop() != '(') ;
			} else {
				st.push(x);
			}
		}

		for (char x : st) {
			answer += x;
		}

		return answer;
	}
	public static void main(String[] args) {
		P41_괄호문자제거 T = new P41_괄호문자제거();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
