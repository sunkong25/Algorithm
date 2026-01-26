package 자바_코딩테스트_it_대기업_유제.section04_자료구조_활용;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class S21_가장많이사용된회의실 {
	public int solution(int n, int[][] meetings) {
		int answer = 0;
		int m = meetings.length;

		Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
		TreeSet<Integer> rooms = new TreeSet<>();
		int[] count = new int[n];

		for (int i = 0; i < n; i++) {
			rooms.add(i);
		}
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
		for (int i = 0; i < m; i++) {
			while (!pq.isEmpty() && pq.peek()[1] <= meetings[i][0]) {
				int[] meeting = pq.poll();
				rooms.add(meeting[0]);
			}
			if (!rooms.isEmpty()) {
				int room = rooms.pollFirst();
				count[room]++;
				pq.offer(new int[]{room, meetings[i][1]});
			} else {
				int[] meeting = pq.poll();
				count[meeting[0]]++;
				pq.offer(new int[]{meeting[0], meeting[1] + (meetings[i][1] - meetings[i][0])});
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max < count[i]) {
				max = count[i];
				answer = i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		S21_가장많이사용된회의실 T = new S21_가장많이사용된회의실();
		System.out.println(T.solution(2, new int[][]{{0, 5}, {2, 7}, {4, 5}, {7, 10}, {9, 12}}));
		System.out.println(T.solution(3, new int[][]{{3, 9}, {1, 10}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
		System.out.println(T.solution(3, new int[][]{{1, 30}, {2, 15}, {3, 10}, {4, 12}, {6, 10}}));
		System.out.println(T.solution(4, new int[][]{{3, 20}, {1, 25}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
	}
}
