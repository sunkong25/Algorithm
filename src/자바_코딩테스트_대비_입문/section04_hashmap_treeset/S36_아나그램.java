package 자바_코딩테스트_대비_입문.section04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class S36_아나그램 {
	public String solution(String input1, String input2) {
		String answer = "YES";
		HashMap<Character, Integer> h = new HashMap<>();
		for (char x : input1.toCharArray()) {
			h.put(x, h.getOrDefault(x, 0) + 1);
		}
		for (char x : input2.toCharArray()) {
			if (!h.containsKey(x) || h.get(x) == 0) {
				return "NO";
			}
			h.put(x, h.get(x) - 1);
		}

		return answer;
	}
	public static void main(String[] args) {
		S36_아나그램 T = new S36_아나그램();
		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();
		String input2 = sc.next();

		System.out.println(T.solution(input1, input2));
	}
}
