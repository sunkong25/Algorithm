package 코딩테스트_대비_입문.dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Block implements Comparable<Block>{
	public int s, h, w;

	public Block(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Block b) {
		return this.s - b.s;
	}
}
public class P101_가장높은탑쌓기 {
	static ArrayList<Block> block = new ArrayList<>();;
	public int solution() {
		int answer = 0;
		Collections.sort(block);
		int[] dy = new int[block.size()];
		dy[0] = block.get(0).h;
		answer = dy[0];

		for (int i = 0; i < block.size(); i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (block.get(j).w < block.get(i).w && max < dy[j]) {
					max = dy[j];
				}
			}
			dy[i] = max + block.get(i).h;
			answer = Math.max(answer, dy[i]);
		}

		return answer;
	}
	public static void main(String[] args) {
		P101_가장높은탑쌓기 T = new P101_가장높은탑쌓기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();
			block.add(new Block(s, h, w));
		}

		System.out.println(T.solution());
	}
}
