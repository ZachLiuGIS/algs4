public class UnionFindTest {
	public static void main(String[] args) {
		In in =  new In(args[0]);
		
		int N = in.readInt();
		
		Stopwatch timer = new Stopwatch();
		UF_WeightedQuickUnion uf = new UF_WeightedQuickUnion(N);
		
		while (!in.isEmpty()) {
			int p = in.readInt();
			int q = in.readInt();
			if (uf.connected(p, q)) continue;
			uf.union(p, q);
			StdOut.println(p + " " + q);
		}
		double elapsedTime = timer.elapsedTime();
		StdOut.println(uf.count() + " components");
		StdOut.println("running time: " + elapsedTime);
	}
}