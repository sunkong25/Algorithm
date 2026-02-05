package 자바_코딩테스트_it_대기업_유제.section05_sorting_thinking;

import java.util.ArrayList;

public class S27_최소회의실개수 {
	public int solution(int[][] meetings) {
		int answer = 0;
		int n = meetings.length;
		ArrayList<int[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new int[]{meetings[i][0], 1});
			list.add(new int[]{meetings[i][1], 2});

		}
		list.sort((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
		int room = 0;
		for (int[] x : list) {
			if(x[1] == 1) room++;
			else room--;
			answer = Math.max(answer, room);
		}

		return answer;
	}

	public static void main(String[] args) {
		S27_최소회의실개수 T = new S27_최소회의실개수();
		System.out.println(T.solution(new int[][]{{0, 10}, {20, 25}, {5, 15}, {2, 5}}));
		System.out.println(T.solution(new int[][]{{1, 30}, {2, 15}, {3, 10}, {4, 12}, {6, 10}}));
		System.out.println(T.solution(new int[][]{{3, 9}, {1, 10}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
		System.out.println(T.solution(new int[][]{{0, 5}, {2, 7}, {4, 5}, {7, 10}, {9, 12}}));
	}
}
