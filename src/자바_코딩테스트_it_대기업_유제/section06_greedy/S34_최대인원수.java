package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class S34_최대인원수 {
	public int solution(int n, int[][] trans, int[][] bookings){
		int answer = 0;
		int[] sum = new int[n + 1];
		for (int i = 0; i < trans.length; i++) {
			sum[trans[i][0]] += trans[i][2];
			sum[trans[i][1]] -= trans[i][2];
		}
		for (int i = 1; i <= n; i++) {
			sum[i] += sum[i - 1];
		}

		Arrays.sort(bookings, (a, b) -> a[0] - b[0]);
		ArrayList<Integer> a = new ArrayList<>();
		int j = 0;

 		for (int i = 1; i<=n; i++) {
			while (!a.isEmpty() && i == a.getFirst()) {
				a.removeFirst();
				answer++;
			}
			while (j < bookings.length && i == bookings[j][0]) {
				a.add(bookings[j][1]);
				j++;
			}
			Collections.sort(a);
			while (sum[i] < a.size()) {
				a.removeLast();
			}
		}


		return answer;
	}

	public static void main(String[] args){
		S34_최대인원수 T = new S34_최대인원수();
		System.out.println(T.solution(5, new int[][]{{1, 4, 2}, {2, 5, 1}}, new int[][]{{1, 2}, {1, 5}, {2, 3}, {2, 4}, {2, 5}, {2, 5}, {3, 5}, {3, 4}}));
		System.out.println(T.solution(5, new int[][]{{2, 3, 1}, {1, 5, 1}}, new int[][]{{2, 5}, {1, 5}, {1, 3}, {2, 4}, {2, 5}, {2, 3}}));
		System.out.println(T.solution(8, new int[][]{{1, 8, 3}, {3, 8, 1}}, new int[][]{{1, 3}, {5, 8}, {2, 7}, {3, 8}, {2, 7}, {2, 8}, {3, 8}, {6, 8}, {7, 8}, {5, 8}, {2, 5}, {2, 7}, {3, 7}, {3, 8}}));
		System.out.println(T.solution(9, new int[][]{{1, 8, 3}, {3, 9, 2}, {1, 5, 3}}, new int[][]{{1, 9}, {5, 8}, {2, 9}, {3, 8}, {2, 9}, {1, 9}, {8, 9}, {3, 9}, {1, 8}, {6, 8}, {7, 8}, {5, 8}, {3, 5}, {3, 7}, {4, 7}, {5, 8}}));
		System.out.println(T.solution(9, new int[][]{{2, 7, 2}, {3, 9, 2}, {1, 5, 3}}, new int[][]{{1, 9}, {4, 8}, {2, 9}, {5, 9}, {3, 8}, {2, 9}, {1, 9}, {8, 9}, {3, 9}, {1, 8}, {6, 8}, {3, 6}, {7, 8}, {5, 8}, {3, 5}, {2, 7}, {1, 7}, {2, 8}}));
	}
}
