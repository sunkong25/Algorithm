package 자바_코딩테스트_대비_입문.hashmap_treeset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P35_학급회장 {
	public char solution(int n, String input) {
		char answer = ' ';
		HashMap<Character, Integer> h = new HashMap<>();
		int max = Integer.MIN_VALUE;

		for (char x : input.toCharArray()) {
			h.put(x, h.getOrDefault(x, 0) + 1);
		}

		for (char x : h.keySet()) {
			if (h.get(x) > max) {
				max = h.get(x);
				answer = x;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		P35_학급회장 T = new P35_학급회장();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String input = sc.next();

		System.out.println(T.solution(n, input));
	}
}
