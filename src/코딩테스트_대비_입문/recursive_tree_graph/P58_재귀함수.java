package 코딩테스트_대비_입문.recursive_tree_graph;

public class P58_재귀함수 {
	public void DFS(int n){
		if(n==0)
			return;
		System.out.println(n);
		DFS(n-1);
	}
	public static void main(String[] args) {
		P58_재귀함수 T = new P58_재귀함수();
		T.DFS(3);
	}
}
