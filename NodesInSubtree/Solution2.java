import java.util.LinkedList;

class Solution2 {
	
	public static char C[];
	public static LinkedList[] adjList;
	
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		String s = sc.nextLine();
		C = new char[N+1];
		adjList = new LinkedList[N+1];
		
		for(int i=1; i<N+1; i++) {
			C[i] = s.charAt(i-1);
			adjList[i] = new LinkedList<Integer>();
		}

		for(int i=0; i<N-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adjList[u].add(v);			
		}
		
		for(int i=0; i<Q; i++) {
			String q = sc.nextLine();
			
			int u = Integer.parseInt(q.substring(0,1));
			char c = q.charAt(q.length()-1);
			
			int count = find(u, c);
			System.out.println(count);
		}
	}


	private static int find(int u, char ch) {
		
		int count=0;
		
		for(int i=0; i<adjList[u].size(); i++) {
			count += find((int)adjList[u].get(i), ch);
		}
		
		if(C[u] == ch)
			count++;
		
		return count;
	}
}
