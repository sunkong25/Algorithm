package 자바_코딩테스트_it_대기업_유제.section04_자료구조_활용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Cpu implements Comparable<Cpu> {
	public int idx, sT, wT;

	public Cpu(int idx, int sT, int wT) {
		this.idx = idx;
		this.sT = sT;
		this.wT = wT;
	}

	@Override
	public int compareTo(Cpu c) {
		if (this.wT == c.wT) {
			return this.idx - c.idx;
		}
		return this.wT - c.wT;
	}
}

public class P20_CPU스케쥴링 {
	public int[] solution(int[][] tasks) {
		int[] answer = {};
		ArrayList<Cpu> cpu = new ArrayList<>();
		int n = tasks.length;

		for (int i = 0; i < tasks.length; i++) {
			cpu.add(new Cpu(i, tasks[i][0], tasks[i][1]));
		}
		cpu.sort((a, b) -> {
			return a.sT - b.sT;
		});

		PriorityQueue<Cpu> pQ = new PriorityQueue<>();
		ArrayList<Cpu> a = new ArrayList<>();

		int pos = 0;
		int fT = 0;
		for (int t = 0; t <= 10000; t++) {
			while (pos < n && t == cpu.get(pos).sT) {
				if(pQ.isEmpty() && fT < cpu.get(pos).sT) fT = cpu.get(pos).sT;
				pQ.offer(cpu.get(pos));
				pos++;
			}
			if(!pQ.isEmpty() && fT == t){
				Cpu c = pQ.poll();
				a.add(c);
				fT += c.wT;
			}
		}

		answer = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			answer[i] = a.get(i).idx;
		}

		return answer;
	}

	public static void main(String[] args) {
		P20_CPU스케쥴링 T = new P20_CPU스케쥴링();
		System.out.println(Arrays.toString(T.solution(new int[][]{{2, 3}, {1, 2}, {8, 2}, {3, 1}, {10, 2}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{5, 2}, {7, 3}, {1, 3}, {1, 5}, {2, 2}, {1, 1}})));
		System.out.println(Arrays.toString(
				T.solution(new int[][]{{1, 2}, {2, 3}, {1, 3}, {3, 3}, {8, 2}, {1, 5}, {2, 2}, {1, 1}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{999, 1000}, {996, 1000}, {998, 1000}, {999, 7}})));
	}
}
