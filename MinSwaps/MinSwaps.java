
class MinSwaps {
	
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		int[] A = new int[1000];
		int T,N,max,pos;
		int i,mid,mid2,min=Integer.MAX_VALUE/2,diff;
		StringBuilder sb = new StringBuilder();
		
		T = sc.nextInt();
		while(T != 0) {
			T--;
			
			N = sc.nextInt();
			max = Integer.MIN_VALUE/2;
			pos = -1;
			
			mid2 = N>>1;
			if(N%2 == 0)
				mid = mid2-1;
			else
				mid = mid2;
			
			diff = Integer.MAX_VALUE/2;
			
			for(i=0; i<N; i++) {
				A[i] = sc.nextInt();
				
				if(A[i] >= max && i<=mid) {
					diff = mid-i;
					max = A[i];
					pos = i;
				} else if(A[i] >= max && i>=mid2) {
					
					if(A[i] > max) {
						diff = i-mid2;
						max = A[i];
						pos = i;
					} else if(A[i] == max) {
						if(i-mid2 < diff) {
							diff  = i-mid2;
							max = A[i];
							pos = i;
						}
					}
				}
			}
			
			min=Integer.MAX_VALUE/2;
			
			if(N%2 != 0) {
				sb.append(Math.abs(pos-mid)).append("\n");
			} else {
				if(pos == mid || pos == mid2)
					sb.append("0").append("\n");
				else {
					if(pos < mid)
						min = mid - pos;
					else
						min = Math.min(min, pos-mid2);
					sb.append(min).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
