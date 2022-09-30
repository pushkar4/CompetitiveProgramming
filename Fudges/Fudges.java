
class Fudges {

  public static int T, M, N;
  public static int[] A = new int[1001];
  public static boolean[][] S = new boolean[1000][10000];

  public static void main(String[] args) {

    FastReader sc = new FastReader();
    StringBuilder sb = new StringBuilder();

    T = sc.nextInt();

    while (T != 0) {
      T--;

      M = sc.nextInt();

      for (int i = 1; i <= M; i++)
        A[i] = sc.nextInt();

      N = sc.nextInt();

      if (isPossible())
        sb.append("YES\n");
      else
        sb.append("NO\n");
    }
    System.out.println(sb);
  }

  private static boolean isPossible() {

    for (int i = 0; i <= M; i++)
      S[i][0] = true;

    for (int i = 1; i <= M; i++) {
      for (int j = 1; j <= N; j++) {
        S[i][j] = S[i - 1][j];
        if (j - A[i] >= 0) {
          S[i][j] = S[i][j] || S[i - 1][j - A[i]];
        }
      }
    }
    return S[M][N];
  }
}
