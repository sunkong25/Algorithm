package 자바_코딩테스트_대비_입문.section01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class P14_문자열압축 {
	public String solution(String input) {
		String answer = "";
		ArrayList<Integer> index = new ArrayList<>();
		index.add(0);

		for (int i = 1; i < input.length(); i++) {
			if(input.charAt(i-1) != input.charAt(i)) index.add(i);
		}

		index.add(input.length());

		for (int i = 0; i < index.size()-1; i++) {
			answer += input.charAt(index.get(i));
			if (index.get(i + 1) - index.get(i) != 1) {
				answer += index.get(i + 1) - index.get(i);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		P14_문자열압축 T = new P14_문자열압축();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
