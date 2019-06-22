import java.io.IOException;

class solution {
	
	public static int n, k;
	public static char c;
	public static String s;
	public static StringBuilder sb = new StringBuilder();
	public static char[][] b;
	public static int[][] p;
	public static int[][] ways;	

	public static void main(String[] args) throws IOException {

		FastReader sc = new FastReader();
		
		int t = sc.nextInt();
		while(t != 0) {
			t--;
			n = sc.nextInt();
			
			b = new char[n][n];
			p = new int[n][n];
			ways = new int[n][n];
			
			for(int i = 0; i<n; i++) {
				s = sc.nextLine();
				k = 0;
				for(int j = 0; j<s.length(); j+=2) {
					b[i][k] = s.charAt(j);
					k++;
				}
			}
			solve();
		}
		System.out.println(sb);
	}

	private static void solve() {
		
		p[n-1][n-1] = 0;
		p[0][0] = -1;
		ways[n-1][n-1] = 1;
		
		for(int i = n-1; i>=0; i--) {
			for(int j = n-1; j>=0; j--) {
				if(i == n-1 && j == n-1)
					continue;
				p[i][j] = getMaxFor(i,j);
			}
		}
		if(p[0][0] != -1)
			sb.append(p[0][0])
				.append(" ")
				.append(String.valueOf(ways[0][0]))
				.append("\n");
		else
			sb.append("0 0").append("\n");
	}

	private static int getMaxFor(int i, int j) {

		if(b[i][j] == 'x')
			return -1;
		
		int max=-1;
		
		if(isValid(i,j+1))
			max = p[i][j+1];
		
		if(isValid(i+1,j))
			max = Math.max(max, p[i+1][j]);
		
		if(isValid(i+1,j+1))
			max = Math.max(max, p[i+1][j+1]);
		
		if(isValid(i,j+1) && max==p[i][j+1])
			ways[i][j] += ways[i][j+1];
		
		if(isValid(i+1,j) && max==p[i+1][j])
			ways[i][j] += ways[i+1][j];
		
		if(isValid(i+1,j+1) && max==p[i+1][j+1])
			ways[i][j] += ways[i+1][j+1];
		
		if(b[i][j] != 'e' && max != -1)
			return max + Character.getNumericValue(b[i][j]);
		else
			return max;
	}

	private static boolean isValid(int i, int j) {

		if(i<0 || i>n-1 || j<0 || j>n-1)
			return false;

		if(b[i][j] == 'x')
			return false;
		
		if(p[i][j] == -1)
			return false;
		
		return true;
	}
}
