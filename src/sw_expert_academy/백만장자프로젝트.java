package sw_expert_academy;

import java.util.Scanner;

public class 백만장자프로젝트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			long[] a = new long[num];
			for (int j = 0; j < num; j++) {
				a[j] = sc.nextLong();
			}

			long answer = 0;
			long max = 0;

			for (int k = a.length - 1; k >= 0; k--) {
				if(max < a[k]){
					max = a[k];
				}
				if (a[k] < max) {
					answer += max - a[k];
				}
			}

			System.out.println("#" + (i + 1) + " " + answer);
		}
	}
}
