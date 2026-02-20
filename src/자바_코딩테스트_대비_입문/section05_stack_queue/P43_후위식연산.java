package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class P43_후위식연산 {
	public int solution(String input) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();

		for (char x : input.toCharArray()) {
			if (Character.isDigit(x)) {
				st.push(Integer.parseInt(String.valueOf(x)));
			} else {
				int rt = st.pop();
				int lt = st.pop();
				switch (x) {
					case '+' :
						answer = lt + rt;
						break;
					case '-' :
						answer = lt - rt;
						break;
					case '*' :
						answer = lt * rt;
						break;
					case '/' :
						answer = lt / rt;
						break;
				}

				st.push(answer);
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		P43_후위식연산 T = new P43_후위식연산();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
