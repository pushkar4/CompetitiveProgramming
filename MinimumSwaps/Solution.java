import java.util.LinkedList;

class Solution {
	
	public static int m, n, r1, r2, c1, c2, q;

	public static void main(String[] args) {
		
		//System.out.println("REMOVE");
		
		FastReader sc = new FastReader();
		
		int t, i, j, max, min, d;
		int A[][] = new int[500][500];
		LinkedList<Pair> list;
		
		t = sc.nextInt();
		
		while(t != 0) {
			t--;
			
			list = new LinkedList<Pair>();
			max = -1;
			
			m = sc.nextInt();
			n = sc.nextInt();
			
			if(m % 2 == 0) {
				r1 = m/2 - 1;
				r2 = m/2;
			} else {
				r1 = r2 = m/2;
			}
			
			if(n % 2 == 0) {
				c1 = n/2 - 1;
				c2 = n/2;
			} else {
				c1 = c2 = n/2;
			}
			
			for(i=0; i<m; i++) {
				for(j=0; j<n; j++) {
					A[i][j] = sc.nextInt();
					if(A[i][j] == max) {
						q = fetchQuarter(i,j);
						d = fetchDistance(i,j);
						list.add(new Pair(i, j, q, d));
					} else if(A[i][j] > max) {
						max = A[i][j];
						list.clear();
						q = fetchQuarter(i,j);
						d = fetchDistance(i,j);
						list.add(new Pair(i, j, q, d));
					}
				}
			}
			
			min = 999999999;
			for(Pair p: list) {
				if(p.d < min)
					min = p.d;
			}
			
			System.out.println(min);			
		}
	}

	private static int fetchQuarter(int i, int j) {
		int q = -1;
		
		// 1 2
		// 3 4
		
		if(i >= 0 && i <= r1 && j >= 0 && j <= c1)
			q = 1;
		else if(i >= 0 && i <= r1 && j >= c2 && j <= n-1)
			q = 2;
		else if(i >= r2 && i <= m-1 && j >= 0 && j <= c1)
			q = 3;
		else if(i >= r2 && i <= m-1 && j >= c2 && j <= n-1)
			q = 4;

		return q;
	}

	private static int fetchDistance(int i, int j) {
		int d = -1;
		
		switch(q) {
		case 1:
			d = r1-i + c1-j;
			break;
		case 2:
			d = r1-i + j-c2;
			break;
		case 3:
			d = i-r2 + c1-j;
			break;
		case 4:
			d = i-r2 + j-c2;
			break;	
		}
		
		return d;
	}
}
