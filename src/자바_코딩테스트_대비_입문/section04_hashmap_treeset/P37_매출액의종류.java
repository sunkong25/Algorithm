package 자바_코딩테스트_대비_입문.section04_hashmap_treeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P37_매출액의종류 {
	public ArrayList<Integer> solution(int n, int k, int[] amount) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> h = new HashMap<>();
		int lt = 0, cnt = 0;
		for (int rt = 0; rt < n; rt++) {
			cnt++;
			h.put(amount[rt], h.getOrDefault(amount[rt], 0) + 1);
			if (cnt == k) {
				answer.add(h.size());
				h.put(amount[lt], h.get(amount[lt]) - 1);
				if (h.get(amount[lt]) == 0) {
					h.remove(amount[lt]);
				}
				lt++;
				cnt--;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		P37_매출액의종류 T = new P37_매출액의종류();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] amount = new int[n];

		for (int i = 0; i < n; i++) {
			amount[i] = sc.nextInt();
		}

		for (int x : T.solution(n, k, amount)) {
			System.out.print(x + " ");
		}
	}
}
