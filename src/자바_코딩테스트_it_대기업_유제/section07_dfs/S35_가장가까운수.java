package 자바_코딩테스트_it_대기업_유제.section07_dfs;

import java.util.ArrayList;
import java.util.Collections;

public class S35_가장가까운수 {
	ArrayList<Integer> nums;
	int m, target, answer;
	int[] ch;
	boolean flag;

	public void DFS(int L, int num) {
		if(flag) return;
		if (L == m) {
			if (num > target) {
				answer = num;
				flag = true;
			}
		} else {
			for (int i = 0; i < m; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					DFS(L + 1, num * 10 + nums.get(i));
					ch[i] = 0;
				}
			}
		}
	}
	public int solution(int n) {
		answer = 0;
		int tmp = n;
		flag = false;
		target = n;
		nums = new ArrayList<>();

		while (tmp > 0) {
			int x = tmp % 10;
			nums.add(x);
			tmp = tmp / 10;
		}
		Collections.sort(nums);

		m = nums.size();
		ch = new int[m];

		DFS(0, 0);
		if (!flag) {
			answer = -1;
		}
		return answer;
	}

	public static void main(String[] args) {
		S35_가장가까운수 T = new S35_가장가까운수();
		System.out.println(T.solution(123));
		System.out.println(T.solution(321));
		System.out.println(T.solution(20573));
		System.out.println(T.solution(27711));
		System.out.println(T.solution(54312));
	}
}
