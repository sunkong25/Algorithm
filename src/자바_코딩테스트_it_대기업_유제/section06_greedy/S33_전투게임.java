package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Info implements Comparable<Info> {
	public int idx;
	public Character team;
	public int power;

	public Info(int idx, Character team, int power) {
		this.idx = idx;
		this.team = team;
		this.power = power;
	}

	@Override
	public int compareTo(Info i) {
		return this.power - i.power;
	}
}

public class S33_전투게임 {
	public int[] solution(String[] students) {
		int n = students.length;
		int[] answer = new int[n];

		ArrayList<Info> s = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Character a = students[i].split(" ")[0].charAt(0);
			int b = Integer.parseInt(students[i].split(" ")[1]);
			s.add(new Info(i, a, b));
		}
		Collections.sort(s);
		HashMap<Character, Integer> h = new HashMap<>();
		int total = 0, j = 0;
		for (int i = 0; i < n; i++) {
			for (; j < n; j++) {
				if (s.get(i).power > s.get(j).power) {
					total += s.get(j).power;
					char x= s.get(j).team;
					h.put(x, h.getOrDefault(x, 0) + s.get(j).power);
				}
				else break;
			}
			answer[s.get(i).idx] = total - h.getOrDefault(s.get(i).team, 0);
		}
		return answer;
	}

	public static void main(String[] args) {
		S33_전투게임 T = new S33_전투게임();
		System.out.println(Arrays.toString(T.solution(new String[]{"a 20", "b 12", "a 10", "c 11", "e 12"})));
		System.out.println(
				Arrays.toString(T.solution(new String[]{"a 17", "b 12", "a 10", "c 11", "b 24", "a 25", "b 12"})));
		System.out.println(
				Arrays.toString(T.solution(new String[]{"b 20", "c 15", "a 200", "b 11", "b 24", "a 25", "b 12"})));
		System.out.println(
				Arrays.toString(T.solution(new String[]{"a 30", "a 25", "a 25", "b 20", "b 25", "a 25", "b 30"})));
	}
}
