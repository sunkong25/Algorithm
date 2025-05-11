package 코딩테스트_대비_입문.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S02_대소문자변환 {
	public String solution(String input) {
		String answer = "";
		for (char x : input.toCharArray()) {
			//Character의 함수 이용
			/*if (Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			} else {
				answer += Character.toLowerCase(x);
			}*/

			//아스키코드 이용
			if (x >= 97 && x <= 122) {
				answer += (char) (x - 32);
			} else {
				answer += (char) (x + 32);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		S02_대소문자변환 T = new S02_대소문자변환();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
