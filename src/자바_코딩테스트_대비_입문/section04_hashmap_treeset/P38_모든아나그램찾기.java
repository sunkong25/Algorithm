package 자바_코딩테스트_대비_입문.section04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class P38_모든아나그램찾기 {
	public int solution(String s, String t) {
		int answer = 0;

		HashMap<Character, Integer> hs = new HashMap<>();
		HashMap<Character, Integer> ht = new HashMap<>();
		HashMap<Character, Integer> tmp = new HashMap<>();

		for (char x : t.toCharArray()) {
			ht.put(x, ht.getOrDefault(x, 0) + 1);
		}
		for (int i = 0; i < t.length() -1 ; i++) {
			hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
		}

		int lt = 0;
		for (int rt = t.length() - 1; rt < s.length(); rt++) {
			hs.put(s.charAt(rt), hs.getOrDefault(s.charAt(rt), 0) + 1);
			if(ht.equals(hs)) answer++;
			hs.put(s.charAt(lt), hs.get(s.charAt(lt)) - 1);
			if (hs.get(s.charAt(lt)) == 0) {
				hs.remove(s.charAt(lt));
			}
			lt++;
		}

		return answer;
	}
	public static void main(String[] args) {
		P38_모든아나그램찾기 T = new P38_모든아나그램찾기();
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		System.out.println(T.solution(s, t));
	}
}
