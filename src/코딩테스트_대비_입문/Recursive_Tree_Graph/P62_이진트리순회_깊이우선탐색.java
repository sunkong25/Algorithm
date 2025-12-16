package 코딩테스트_대비_입문.Recursive_Tree_Graph;


class NodeD {
	int data;
	NodeD lt, rt;

	public NodeD(int val) {
		data = val;
		lt = rt = null;
	}
}

public class P62_이진트리순회_깊이우선탐색 {
	NodeD root;

	public void DFS(NodeD root) {
		if (root == null) {
			return;
		} else {
			System.out.print(root.data + " ");
			DFS(root.lt);
			DFS(root.rt);
		}
	}

	public static void main(String[] args) {
		P62_이진트리순회_깊이우선탐색 T = new P62_이진트리순회_깊이우선탐색();
		T.root = new NodeD(1);
		T.root.lt = new NodeD(2);
		T.root.rt = new NodeD(3);
		T.root.lt.lt = new NodeD(4);
		T.root.lt.rt = new NodeD(5);
		T.root.rt.lt = new NodeD(6);
		T.root.rt.rt = new NodeD(7);
		T.DFS(T.root);
	}
}
