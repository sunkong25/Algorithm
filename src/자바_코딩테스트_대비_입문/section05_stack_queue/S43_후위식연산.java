package 자바_코딩테스트_대비_입문.section05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class S43_후위식연산 {
	public int solution(String input) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();
		for (char x : input.toCharArray()) {
			if (Character.isDigit(x)) {
				st.push(x - 48);
			} else {
				int rt = st.pop();
				int lt = st.pop();
				if(x == '+') st.push(lt + rt);
				else if(x == '-') st.push(lt - rt);
				else if(x == '*') st.push(lt * rt);
				else if(x == '/') st.push(lt / rt);
			}
		}
		answer = st.get(0);

		return answer;
	}
	public static void main(String[] args) {
		S43_후위식연산 T = new S43_후위식연산();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
