package 코딩테스트_대비_입문.greedy_algorithm;

import java.util.Scanner;

class Person{
	public int h, w;

	public Person(int h, int w) {
		this.h = h;
		this.w = w;
	}
}
public class P89_씨름선수 {
	static int n;
	static int[] ch;

	public void solution(Person[] p) {
		for (int i = 0; i < n; i++) {
			if (ch[i] == 1) break;
			for (int j = 0; j < n; j++) {
				if (p[i].h < p[j].h && p[i].w < p[j].w) {
					ch[i] = 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		P89_씨름선수 T = new P89_씨름선수();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		Person[] p = new Person[n];
		ch = new int[n];

		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			p[i] = new Person(h, w);
		}

		T.solution(p);

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if(ch[i] == 0) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
