
class Solution {

  public static int N, A[], P[], Q, q;
  public static long L[], R[];
  public static int MOD = 1000000007;

  public static void main(String[] args) {

    FastReader sc = new FastReader();

    int T = sc.nextInt();
    while (T != 0) {
      T--;

      N = sc.nextInt();
      A = new int[N];
      P = new int[N];

      A[0] = sc.nextInt();
      P[0] = A[0];
      for (int i = 1; i < N; i++) {
        A[i] = sc.nextInt();
        P[i] = (A[i] + P[i - 1]) % MOD;
      }

      Q = sc.nextInt();
      L = new long[Q];
      R = new long[Q];

      for (int i = 0; i < Q; i++)
        L[i] = sc.nextLong() - 1;

      for (int i = 0; i < Q; i++)
        R[i] = sc.nextLong() - 1;

      q = 0;
      while (q < Q) {
        solve(q);
        q++;
      }
      System.out.println();
    }
  }

  private static void solve(int q) {
    long l = L[q];
    long r = R[q];

    long blk, blk2, b, a = 0;

    blk = (long) Math.ceil(r / N);
    blk2 = (long) Math.ceil(l / N);
    blk = blk - blk2;

    b = ((blk) * P[N - 1]) % MOD;
    int ir = (int) (r % N);
    b = (b + P[ir]) % MOD;

    int il = (int) (l % N);
    if (il != 0)
      a = (a + P[il - 1]) % MOD;
    else
      a = 0;

    System.out.print((b - a) + " ");

  }
}
