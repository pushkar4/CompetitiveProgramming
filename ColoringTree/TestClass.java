
class TestClass2 {
	
	public static int N,Q,t,v,A[],col=1;

	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		
		N = sc.nextInt();
		Q = sc.nextInt();
		A = new int[N+1];
		
		while(Q != 0) {
			Q--;
			
			t = sc.nextInt();
			v = sc.nextInt();
			
			if(t==1) {
				// print color of v
				System.out.println(A[v]);
			} else {
				// color all the vertex of the subtree rooted with vertex v
				// with color which is numbered 1 more than the color used in 
				// the previous query of this type.
				
				color(v);
				col++;
			}
		}
	}

	private static void color(int node) {
		if(node <= N) {
			A[node] = col;
			color(2*node);
			color(2*node + 1);
		}
	}
}
