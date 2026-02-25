package 자바_코딩테스트_it_대기업_유제.section07_dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class S38_팰린드롬의경우수 {
	HashMap<Character, Integer> hs;
	Deque<Character> d;
	ArrayList<String> a;
	int len;

	public void DFS() {
		if (d.size() == len) {
			String pm = "";
			for (char x : d) {
				pm += x;
			}
			a.add(pm);
		} else {
			for (char x : hs.keySet()) {
				if (hs.get(x) == 0) {
					continue;
				}
				d.addFirst(x);
				d.addLast(x);
				hs.put(x, hs.get(x) - 2);
				DFS();

				d.pollFirst();
				d.pollLast();
				hs.put(x, hs.get(x) + 2);
			}
		}
	}

	public String[] solution(String s) {
		String[] answer = {};
		len = s.length();
		hs = new HashMap<>();
		a = new ArrayList<>();
		d = new LinkedList<>();

		for (char x : s.toCharArray()) {
			hs.put(x, hs.getOrDefault(x, 0) + 1);
		}

		int count = 0;
		char mid = '#';
		for (Character x : hs.keySet()) {
			if (hs.get(x) % 2 != 0) {
				count++;
				mid = x;
			}
		}

		if (count > 1) return new String[]{};
		if(mid != '#'){
			d.add(mid);
			hs.put(mid, hs.get(mid) - 1);
		}
		DFS();

		answer = new String[a.size()];
		for (int i = 0; i < a.size(); i++) {
			answer[i] = a.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		S38_팰린드롬의경우수 T = new S38_팰린드롬의경우수();
		System.out.println(Arrays.toString(T.solution("aaaabb")));
		System.out.println(Arrays.toString(T.solution("abbcc")));
		System.out.println(Arrays.toString(T.solution("abbccee")));
		System.out.println(Arrays.toString(T.solution("abbcceee")));
		System.out.println(Arrays.toString(T.solution("ffeffaae")));
	}
}
