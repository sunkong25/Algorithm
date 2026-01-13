package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Info implements Comparable<Info> {
	public String name;
	public int time;

	public Info(String name, int time) {
		this.name = name;
		this.time = time;
	}

	@Override
	public int compareTo(Info info) {
		return this.time - info.time;
	}
}

public class S14_문서도난 {
	public int getTime(String time) {
		int H = Integer.parseInt(time.split(":")[0]);
		int m = Integer.parseInt(time.split(":")[1]);

		return H * 60 + m;
	}

	public String[] solution(String[] reports, String times) {
		String[] answer = {};
		ArrayList<Info> tmp = new ArrayList<>();

		for (String x : reports) {
			String a = x.split(" ")[0];
			int b = getTime(x.split(" ")[1]);
			tmp.add(new Info(a, b));
		}

		Collections.sort(tmp);
		ArrayList<String> answers= new ArrayList<>();
		int start = getTime(times.split(" ")[0]);
		int end = getTime(times.split(" ")[1]);

		for (Info i : tmp) {
			if (i.time >= start && i.time <= end) {
				answers.add(i.name);
			}
			if(i.time > end) break;
		}

		answer = new String[answers.size()];
		for (int i = 0; i < answers.size(); i++) {
			answer[i] = answers.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		S14_문서도난 T = new S14_문서도난();
		System.out.println(Arrays.toString(
				T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"},
						"08:33 09:45")));
		System.out.println(Arrays.toString(T.solution(
				new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23",
						"john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(
				T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"},
						"14:20 15:20")));
	}
}
