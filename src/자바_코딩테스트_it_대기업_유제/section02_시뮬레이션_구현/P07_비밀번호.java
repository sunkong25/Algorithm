package 자바_코딩테스트_it_대기업_유제.section02_시뮬레이션_구현;

import java.util.ArrayList;

class KeyPoint {
	int x, y, value;

	public KeyPoint(int x, int y, int value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}
}

public class P07_비밀번호 {

	public int solution(int[] keypad, String password) {
		int answer = 0;
		char[] pc = password.toCharArray();
		int[] p = new int[pc.length];
		int[][] k = new int[3][3];
		ArrayList<KeyPoint> a = new ArrayList<>();

		for (int i = 0; i < p.length; i++) {
			p[i] = Character.getNumericValue(pc[i]); // password 숫자로 배열에 저장
		}

		for (int i = 0; i < keypad.length; i++) {
			k[i / 3][i % 3] = keypad[i];
		}

		int count = 0;
		while (count < p.length) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (k[i][j] == p[count]) {
						a.add(new KeyPoint(i, j, p[count]));
						break;
					}
				}
			}
			count++;
		}

		for (int i = 1; i < a.size(); i++) {
			if (Math.abs(a.get(i).x - a.get(i - 1).x) == 2 || Math.abs(a.get(i).y - a.get(i - 1).y) == 2) {
				answer += 2;
			} else if (Math.abs(a.get(i).x - a.get(i - 1).x) == 1 || Math.abs(a.get(i).y - a.get(i - 1).y) == 1) {
				answer += 1;
			} else {
				answer += 0;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		P07_비밀번호 T = new P07_비밀번호();
		System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
		System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
}
