import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T != 0) {
			T--;
			
			int N = Integer.parseInt(br.readLine());
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			int c1[] = new int[26];
			int c2[] = new int[26];
			
			for(int i=0; i<N; i++) {
				c1[s1.charAt(i) - 'a']++;
				c2[s2.charAt(i) - 'a']++;
				
			}
			
			int res=0;
			
			for(int i=0; i<26; i++) {
				int min = Math.min(c1[i], c2[i]);
				
				if(min!=0) {
					res+=min;
				}
			}
			System.out.println(res);
		}
	}

}
