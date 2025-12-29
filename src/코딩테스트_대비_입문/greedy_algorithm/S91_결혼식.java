package 코딩테스트_대비_입문.greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Participant implements Comparable<Participant>{
	public int time;
	public char status;
	public Participant(int time, char status){
		this.time = time;
		this.status = status;
	}

	@Override
	public int compareTo(Participant participant) {
		if(this.time == participant.time)
			return this.status - participant.status;
		return this.time - participant.time;
	}
}

public class S91_결혼식 {
	public int solution(ArrayList<Participant> participant) {
		int answer = Integer.MIN_VALUE;
		int cnt = 0;
		Collections.sort(participant);

		for (Participant p : participant) {
			if(p.status == 'e')
				cnt--;
			else cnt++;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	public static void main(String[] args) {
		S91_결혼식 T = new S91_결혼식();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Participant> p = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			p.add(new Participant(start, 's'));
			p.add(new Participant(end, 'e'));
		}

		System.out.println(T.solution(p));
	}
}
