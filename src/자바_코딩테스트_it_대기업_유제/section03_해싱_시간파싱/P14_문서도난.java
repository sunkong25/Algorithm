package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class P14_문서도난 {
	public String[] solution(String[] reports, String times){
		String[] answer = {};
		HashMap<String, LocalTime> reportHash = new HashMap<>();
		LocalTime start = LocalTime.parse(times.split(" ")[0]);
		LocalTime end = LocalTime.parse(times.split(" ")[1]);

		for (String r : reports) {
			String name = r.split(" ")[0];
			LocalTime time = LocalTime.parse(r.split(" ")[1]);
			reportHash.put(name, time);
		}

		ArrayList<String> answers = new ArrayList<>();
		for (String x : reportHash.keySet()) {
			if (!reportHash.get(x).isBefore(start) && !reportHash.get(x).isAfter(end)) {
				answers.add(x);
			}
		}

		answers.sort((a, b) -> reportHash.get(a).compareTo(reportHash.get(b)));
		answer = new String[answers.size()];
		for (int i = 0; i < answers.size(); i++) {
			answer[i] = answers.get(i);
		}

		return answer;
	}

	public static void main(String[] args){
		P14_문서도난 T = new P14_문서도난();
		System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
		System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
	}
}
