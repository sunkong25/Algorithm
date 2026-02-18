package 자바_코딩테스트_대비_입문.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class S44_쇠막대기 {
	public int solution(String input) {
		int answer = 0;
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') st.push('(');
			else {
				st.pop();
				if(input.charAt(i-1) == '(') answer += st.size();
				else answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		S44_쇠막대기 T = new S44_쇠막대기();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}

}
