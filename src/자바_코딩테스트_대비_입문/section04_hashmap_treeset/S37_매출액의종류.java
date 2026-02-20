package 자바_코딩테스트_대비_입문.section04_hashmap_treeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class S37_매출액의종류 {
	public ArrayList<Integer> solution(int n, int k, int[] amount) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> h = new HashMap<>();

		for (int i = 0; i < k -1 ; i++) {
			h.put(amount[i], h.getOrDefault(amount[i], 0) + 1);
		}

		int lt = 0;
		for (int rt = k - 1; rt < n; rt++) {
			h.put(amount[rt], h.getOrDefault(amount[rt], 0) + 1);
			answer.add(h.size());
			h.put(amount[lt], h.get(amount[lt]) -1);
			if (h.get(amount[lt]) == 0) {
				h.remove(amount[lt]);
			}
			lt++;
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
