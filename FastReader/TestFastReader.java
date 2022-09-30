
public class TestFastReader {

  public static void main(String[] args) {

    FastReader sc = new FastReader();

    int t = sc.nextInt();
    String s = "";
    while (t != 0) {
      t--;
      char c = sc.nextChar(); // Sometimes doe not work when you hit enter after a char it takes \r \n as characters
      s += c;
    }
    System.out.println("out " + s);


//		String sen =sc.nextLine();
//		System.out.println(sen);
//		int t= sc.nextInt();
//		int N=0,Q=0,a[] = new int[1];
//		while(t != 0 ) {
//			t--;
//
//			N = sc.nextInt();
//			Q = sc.nextInt();
//
//			a = new int[N];
//			for(int i=0;i<N;i++) {
//				a[i] = sc.nextInt();
//			}
//			System.out.println();
//			System.out.println(" " + N);
//			System.out.println(" " + Q);
//			for(int i=0;i<N;i++) {
//				System.out.print(" " + a[i]);
//			}
//		}
  }
}
