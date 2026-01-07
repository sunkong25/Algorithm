package 자바_코딩테스트_대비_입문.string;

import java.util.ArrayList;
import java.util.Scanner;

public class P07_단어뒤집기 {
	public void solution(ArrayList<String> str) {
		for (String s : str) {
			char[] c = s.toCharArray();
			for (int i = c.length - 1; i >= 0; i--) {
				System.out.print(c[i]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P07_단어뒤집기 T = new P07_단어뒤집기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<String> str = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			str.add(sc.next());
		}
		T.solution(str);
	}
}
