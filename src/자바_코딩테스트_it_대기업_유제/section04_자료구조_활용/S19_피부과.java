package 자바_코딩테스트_it_대기업_유제.section04_자료구조_활용;

import java.util.LinkedList;
import java.util.Queue;

public class S19_피부과 {
	public int getTime(String time) {
		int H = Integer.parseInt(time.split(":")[0]);
		int M = Integer.parseInt(time.split(":")[1]);

		return H * 60 + M;
	}

	public int solution(int[] laser, String[] enter) {
		int answer = 0;
		int n = enter.length;

		int[][] enterT = new int[enter.length][enter.length];
		for (int i = 0; i < enter.length; i++) {
			enterT[i][0] = getTime(enter[i].split(" ")[0]);
			enterT[i][1] = Integer.parseInt(enter[i].split(" ")[1]);
		}

		Queue<Integer> Q = new LinkedList<>();
		Q.offer(enterT[0][1]);
		int fT = enterT[0][0];
		int pos = 1;
		for (int t = fT; t <= 1200; t++) {
			if (pos < n && t == enterT[pos][0]) {
				if(Q.isEmpty() && fT < enterT[pos][0]) fT = enterT[pos][0];
				Q.offer(enterT[pos][1]);
				pos++;
			}
			if (t == fT && !Q.isEmpty()) {
				int idx = Q.poll();
				fT += laser[idx];
			}
			answer = Math.max(answer, Q.size());
		}

		return answer;
	}

	public static void main(String[] args) {
		S19_피부과 T = new S19_피부과();
		System.out.println(T.solution(new int[]{30, 20, 25, 15},
				new String[]{"10:23 0", "10:40 3", "10:42 2", "10:52 3", "11:10 2"}));
		System.out.println(T.solution(new int[]{30, 20, 25, 15},
				new String[]{"10:23 0", "10:40 3", "10:42 2", "10:52 3", "15:10 0", "15:20 3", "15:22 1", "15:23 0",
						"15:25 0"}));
		System.out.println(T.solution(new int[]{30, 20, 25, 15},
				new String[]{"10:20 1", "10:40 1", "11:00 1", "11:20 1", "11:40 1"}));
	}
}
