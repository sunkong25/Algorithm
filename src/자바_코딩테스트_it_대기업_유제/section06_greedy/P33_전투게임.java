package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Student implements Comparable<Student>{
	public int index, num;
	public char team;

	public Student(int index, char team, int num) {
		this.index = index;
		this.team = team;
		this.num = num;
	}

	@Override
	public int compareTo(Student student) {
		return this.num - student.num;
	}
}
public class P33_전투게임 {
	public int[] solution(String[] students){
		int n = students.length;
		int[] answer = new int[n];
		ArrayList<Student> s = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			char team = students[i].split(" ")[0].charAt(0);
			int num = Integer.parseInt(students[i].split(" ")[1]);
			s.add(new Student(i, team, num));
		}
		Collections.sort(s);

		int total = 0;
		HashMap<Character, Integer> h = new HashMap<>();

		for (int i = 0, k = 0; i < n; i++) {
			for (int j = k; j < i; j++) {
				if (s.get(i).num > s.get(j).num) {
					h.put(s.get(j).team, h.getOrDefault(s.get(j).team, 0) + s.get(j).num);
					total += s.get(j).num;
					k++;
				}
			}
			answer[s.get(i).index] = total - h.getOrDefault(s.get(i).team, 0);
		}
		return answer;
	}

	public static void main(String[] args){
		P33_전투게임 T = new P33_전투게임();
		System.out.println(Arrays.toString(T.solution(new String[]{"a 20", "b 12", "a 10", "c 11", "e 12"})));
		System.out.println(Arrays.toString(T.solution(new String[]{"a 17", "b 12", "a 10", "c 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(T.solution(new String[]{"b 20", "c 15", "a 200", "b 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(T.solution(new String[]{"a 30", "a 25", "a 25", "b 20", "b 25", "a 25", "b 30"})));
	}
}
