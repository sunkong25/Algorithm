package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class P15_경고메일 {
	public String[] solution(String[] reports, int time){
		String[] answer = {};
		HashMap<String, ArrayList<Integer>> h = new HashMap<>();
		for (String x : reports) {
			String a = x.split(" ")[0];
			String b = x.split(" ")[1];

			int t = Integer.parseInt(b.split(":")[0]) *60 + Integer.parseInt(b.split(":")[1]);
			h.putIfAbsent(a, new ArrayList<>());
			h.get(a).add(t);
		}

		ArrayList<String> p = new ArrayList<>();
		for (String r : h.keySet()) {
			int tmp = 0;
			for (int i = h.get(r).size()-1; i >= 0; i = i - 2) {
				tmp += h.get(r).get(i) - h.get(r).get(i-1);
			}
			if (tmp > time) {
				p.add(r);
			}
		}
		Collections.sort(p);

		answer = new String[p.size()];
		for (int i = 0; i < p.size(); i++) {
			answer[i] = p.get(i);
		}

		return answer;
	}

	public static void main(String[] args){
		P15_경고메일 T = new P15_경고메일();
		System.out.println(Arrays.toString(T.solution(new String[]{"john 09:30 in", "daniel 10:05 in", "john 10:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 12:35 out", "daniel 15:05 out"}, 60)));
		System.out.println(Arrays.toString(T.solution(new String[]{"bill 09:30 in", "daniel 10:00 in", "bill 11:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 14:35 out", "daniel 14:55 out"}, 120)));
		System.out.println(Arrays.toString(T.solution(new String[]{"cody 09:14 in", "bill 09:25 in", "luis 09:40 in", "bill 10:30 out", "cody 10:35 out", "luis 10:35 out", "bill 11:15 in", "bill 11:22 out", "luis 15:30 in", "luis 15:33 out"}, 70)));
		System.out.println(Arrays.toString(T.solution(new String[]{"chato 09:15 in", "emilly 10:00 in", "chato 10:15 out", "luis 10:57 in", "daniel 12:00 in", "emilly 12:20 out", "luis 11:20 out", "daniel 15:05 out"}, 60)));
	}
}
