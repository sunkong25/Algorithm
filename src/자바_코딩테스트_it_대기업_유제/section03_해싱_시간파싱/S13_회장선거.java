package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class S13_회장선거 {
	public String solution(String[] votes, int k) {
		String answer = " ";
		HashMap<String, HashSet<String>> voteHash = new HashMap<>();
		HashMap<String, Integer> candidate = new HashMap<>();
		HashMap<String, Integer> present = new HashMap<>();

		for (String x : votes) {
			String a = x.split(" ")[0];
			String b = x.split(" ")[1];

			voteHash.putIfAbsent(a, new HashSet<>());
			voteHash.get(a).add(b);
			candidate.put(b, candidate.getOrDefault(b, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		for (String a : voteHash.keySet()) {
			int cnt = 0;
			for (String b : voteHash.get(a)) {
				if (candidate.get(b) >= k) {
					cnt++;
				}
			}
			present.put(a, cnt);
			max = Math.max(max, cnt);
		}
		ArrayList<String> tmp = new ArrayList<>();
		for (String p : present.keySet()) {
			if (present.get(p) == max) {
				tmp.add(p);
			}
		}
		tmp.sort((a, b) -> a.compareTo(b));
		answer = tmp.get(0);
		return answer;
	}

	public static void main(String[] args) {
		S13_회장선거 T = new S13_회장선거();
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
