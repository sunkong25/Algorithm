package Doit_알고리즘_코딩테스트.정렬.삽입정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P11399_ATM인출시간계산하기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int index = 1;
        for (int i = 0; i < N-1; i++) {
            int num = list.get(index);
            for (int j = 0; j <= i; j++) {
                if (list.get(j) >= num) {
                    list.remove(index);
                    list.add(j, num);
                    break;
                }
            }
            index++;
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                sum += list.get(j);
            }
        }
        System.out.println(sum);
    }
}
