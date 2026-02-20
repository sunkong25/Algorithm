package 자바_코딩테스트_대비_입문.section04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class P36_아나그램 {
	public String solution(String input1, String input2) {
		String answer = "YES";

		HashMap<Character, Integer> h1 = new HashMap<>();
		HashMap<Character, Integer> h2 = new HashMap<>();

		for (int i = 0; i < input1.length(); i++) {
			h1.put(input1.charAt(i), h1.getOrDefault(input1.charAt(i), 0) + 1);
			h2.put(input2.charAt(i), h2.getOrDefault(input2.charAt(i), 0) + 1);
		}

		for (char x : h1.keySet()) {
			if (h1.get(x) != h2.get(x)) {
				answer = "NO";
			}
			h2.remove(x);
		}
		if (!h2.isEmpty()) {
			answer = "NO";
		}

		return answer;
	}
	public static void main(String[] args) {
		P36_아나그램 T = new P36_아나그램();
		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();
		String input2 = sc.next();

		System.out.println(T.solution(input1, input2));
	}
}
