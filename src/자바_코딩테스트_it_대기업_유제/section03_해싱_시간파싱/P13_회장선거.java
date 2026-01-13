package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.HashMap;

public class P13_회장선거 {
	public String solution(String[] votes, int k) {
		String answer = " ";
		HashMap<String, Integer> pc = new HashMap<>();
		HashMap<String, Integer> r = new HashMap<>();
		String[][] student = new String[votes.length][2];

		for (int i = 0; i < votes.length; i++) {
			student[i] = votes[i].split(" ");
		}

		for (int i = 0; i < votes.length; i++) {
			pc.put(student[i][1], pc.getOrDefault(student[i][1], 0) + 1);
		}

		for (String x : pc.keySet()) {
			if (pc.get(x) >= k) {
				for (int i = 0; i < student.length; i++) {
					if (student[i][1].equals(x)) {
						r.put(student[i][0], r.getOrDefault(student[i][0], 0) + 1);
					}
				}
			}
		}

		for (String x : r.keySet()) {
			if (r.getOrDefault(answer, 0) < r.getOrDefault(x, 0)) {
				answer = x;
			}else if (r.getOrDefault(answer, 0).equals(r.getOrDefault(x, 0))) {
				if(answer.charAt(0) < x.charAt(0)) continue;
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		P13_회장선거 T = new P13_회장선거();
		System.out.println(
				T.solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"},
						2));
		System.out.println(T.solution(
				new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park",
						"park john", "john park", "tom john", "tom park", "tom luis"}, 2));
		System.out.println(T.solution(
				new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom",
						"luis john"}, 2));
		System.out.println(T.solution(
				new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis",
						"tom bob", "tom luis", "john park", "park john"}, 3));
	}
}
