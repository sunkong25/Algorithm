package 자바_코딩테스트_it_대기업_유제.section07_dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class S39_IP주소 {
	LinkedList<String> tmp;
	ArrayList<String> res;

	public void DFS(int start, String s) {
		if (tmp.size() == 4 && start == s.length()) {
			String num = "";
			for(String x : tmp) num += x + "." ;
			res.add(num.substring(0, num.length() - 1));
		} else {
			for (int i = start; i < s.length(); i++) {
				if (s.charAt(start) == '0' && start < i) return;
				String num = s.substring(start, i + 1);
				if(Integer.parseInt(num) > 255) return;
				tmp.add(num);
				DFS(i + 1, s);
				tmp.pollLast();
			}
		}
	}

	public String[] solution(String s) {
		String[] answer = {};
		tmp = new LinkedList<>();
		res = new ArrayList<>();

		DFS(0, s);
		answer = new String[res.size()];
		for (int i = 0; i < res.size(); i++) {
			answer[i] = res.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		S39_IP주소 T = new S39_IP주소();
		System.out.println(Arrays.toString(T.solution("2025505")));
		System.out.println(Arrays.toString(T.solution("0000")));
		System.out.println(Arrays.toString(T.solution("255003")));
		System.out.println(Arrays.toString(T.solution("155032012")));
		System.out.println(Arrays.toString(T.solution("02325123")));
		System.out.println(Arrays.toString(T.solution("121431211")));
	}
}
