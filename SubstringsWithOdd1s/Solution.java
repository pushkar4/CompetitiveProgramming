import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Solution {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BigInteger zero = new BigInteger("0");
    BigInteger two = new BigInteger("2");
    BigInteger n;
    int ans, rem, len, i;
    StringBuilder s, fAns = new StringBuilder();
    String val;

    int t = Integer.parseInt(br.readLine());

    while (t != 0) {
      t--;

      val = br.readLine();
      n = new BigInteger(val);
      ans = 0;

      s = new StringBuilder();

      while (!n.equals(zero)) {
        rem = n.mod(two).intValue();
        n = n.divide(two);
        s.insert(0, rem);
      }

      if (val.equals("0"))
        s.append("0");

      len = s.length();
      for (i = 0; i < len; i++) {
        ans += fetchCount(s.substring(i, len));
      }

      fAns.append(ans).append("\n");
    }
    System.out.println(fAns);
  }

  private static int fetchCount(String s) {

    boolean isOdd = false;
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      switch (ch) {
        case '1':
          isOdd = !isOdd;
          if (isOdd)
            count++;
          break;
        case '0':
          if (isOdd)
            count++;
          break;
      }
    }

    return count;
  }
}
