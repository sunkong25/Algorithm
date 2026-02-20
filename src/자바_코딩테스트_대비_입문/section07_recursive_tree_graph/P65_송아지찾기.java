package 자바_코딩테스트_대비_입문.section07_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P65_송아지찾기 {
	int[] dis = {-1, 1, 5};
	int[] ch ;
	Queue <Integer> Q = new LinkedList<>();
	 public int BFS(int s, int e){
		 ch = new int[10001];
		 ch[s] = 1;
		 Q.offer(s);
		 int L = 0;
		 while(!Q.isEmpty()){
			 int len = Q.size();
			 for (int i = 0; i < len; i++) { // 한 레벨씩 반복
				 int x = Q.poll();
				 for(int d: dis){
					 int nx = x + d;
					 if(nx == e) return L+1;
					 if(nx>1 && nx<=10000 && ch[nx]==0){
						 ch[nx] = 1;
						 Q.offer(nx);
					 }
				 }
			 }
			 L++;
		 }
		 return 0;
	 }

	 public static void main(String[] args){
		 P65_송아지찾기 T = new P65_송아지찾기();
		 Scanner sc = new Scanner(System.in);
		 int s = sc.nextInt();
		 int e = sc.nextInt();
		 System.out.println(T.BFS(s, e));
	 }
}
