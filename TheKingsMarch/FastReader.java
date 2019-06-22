import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastReader {

	private BufferedReader br;
	private StringTokenizer st;
	
	public FastReader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String next() {
		while(st == null || ! st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();		
	}
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public String nextLine() throws IOException {
		return br.readLine();
	}
}
