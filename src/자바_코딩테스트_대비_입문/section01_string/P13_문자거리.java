package 자바_코딩테스트_대비_입문.section01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class P13_문자거리 {
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		ArrayList<Integer> index = new ArrayList<>();

		int count = 0;
		index.add(s.indexOf(t));
		while (true) {
			count++;
			int i = s.indexOf(t, index.get(count - 1) + 1);
			if(i == -1) break;
			index.add(i);
		}

		for (int i = 0; i < s.length(); i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < index.size(); j++) {
				min = Math.min(min, Math.abs(i - index.get(j)));
			}
			answer[i] = min;
		}
		return answer;
	}

	public static void main(String[] args) {
		P13_문자거리 T = new P13_문자거리();
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char t = sc.next().charAt(0);

		for (int x : T.solution(s, t)) {
			System.out.print(x + " ");
		}
	}
}
