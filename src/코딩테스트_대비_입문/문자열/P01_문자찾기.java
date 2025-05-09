package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class P01_문자찾기 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		char input2 = sc.next().charAt(0);
		int count = 0;

		char[] arr = input1.toCharArray();
		char input3;

		if (input2 >= 97) {
			input3 = Character.toUpperCase(input2);
		} else {
			input3 = Character.toLowerCase(input2);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input3 || arr[i] == input2) {
				count++;
			}
		}

		System.out.println(count);
	}
}
