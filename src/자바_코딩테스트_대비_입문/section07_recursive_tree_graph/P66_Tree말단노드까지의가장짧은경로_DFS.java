package 자바_코딩테스트_대비_입문.section07_recursive_tree_graph;

class TreeNodeDFS {
	int data;
	TreeNodeDFS lf, rf;

	public TreeNodeDFS(int data) {
		this.data = data;
		lf=rf=null;
	}
}

public class P66_Tree말단노드까지의가장짧은경로_DFS {
	TreeNodeDFS root;

	public int DFS(int L, TreeNodeDFS root) {
		if (root.lf == null && root.rf == null) {
			return L;
		}
		return Math.min(DFS(L+1, root.lf), DFS(L+1, root.rf));
	}

	public static void main(String[] ars) {
		P66_Tree말단노드까지의가장짧은경로_DFS T = new P66_Tree말단노드까지의가장짧은경로_DFS();
		T.root = new TreeNodeDFS(1);
		T.root.lf = new TreeNodeDFS(2);
		T.root.rf = new TreeNodeDFS(3);
		T.root.lf.lf = new TreeNodeDFS(4);
		T.root.lf.rf = new TreeNodeDFS(5);
		System.out.println(T.DFS(0, T.root));
	}
}
