package 자바_코딩테스트_it_대기업_유제.section05_sorting_thinking;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P28_최소회의실개수 {
	public int solution(int[][] meetings){
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
		int n = meetings.length;
		int room = 1;
		pq.offer(meetings[0][1]);

		for (int i = 1; i < n; i++) {
			while (!pq.isEmpty() && pq.peek() <= meetings[i][0]) {
				pq.poll();
				room--;
			}
			pq.offer(meetings[i][1]);
			room++;
			answer = Math.max(answer, room);
		}

		return answer;
	}

	public static void main(String[] args){
		P28_최소회의실개수 T = new P28_최소회의실개수();
		System.out.println(T.solution(new int[][]{{0, 10}, {20, 25}, {5, 15}, {2, 5}}));
		System.out.println(T.solution(new int[][]{{1, 30}, {2, 15}, {3, 10}, {4, 12}, {6, 10}}));
		System.out.println(T.solution(new int[][]{{3, 9}, {1, 10}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
		System.out.println(T.solution(new int[][]{{0, 5}, {2, 7}, {4, 5}, {7, 10}, {9, 12}}));
	}
}
