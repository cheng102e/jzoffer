/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q43 {

  public void reverse(char[] c, int start, int end) {
    while (start < end) {
      char temp = c[start];
      c[start++] = c[end];
      c[end--] = temp;
    }
  }

  public String LeftRotateString(String str, int n) {
    int len = str.length();
    if (len < n) {
      return "";
    }
    char[] c = str.toCharArray();
    reverse(c, 0, n - 1);
    reverse(c, n, len - 1);
    reverse(c, 0, len - 1);
    String ans = "";
    for (char q : c) {
      ans += q;
    }
    return ans;
  }
}
