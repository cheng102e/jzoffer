/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q52 {

  public static boolean mate(char[] str, char[] pattern, int si, int pi) {

    if (str.length == si && pattern.length == pi) {
      return true;
    }
    if (str.length != si && pattern.length == pi) {
      return false;
    }
    if (pi + 1 < pattern.length && pattern[pi + 1] == '*') {
      if (si != str.length && ((str[si] == pattern[pi] || pattern[pi] == '.'))) {
        boolean t0 = mate(str, pattern, si, pi + 2);
        boolean t1 = mate(str, pattern, si + 1, pi + 2);
        boolean t2 = mate(str, pattern, si + 1, pi);
        return t0 || t1 || t2;
      } else {
        return mate(str, pattern, si, pi + 2);
      }
    }

    if (si != str.length) {
      if (str[si] == pattern[pi] || pattern[pi] == '.') {
        return mate(str, pattern, si + 1, pi + 1);
      }
    }
    return false;
  }

  public static boolean match(char[] str, char[] pattern) {
    if (str == null || pattern == null) {
      return false;
    }
    int si = 0;
    int pi = 0;
    return mate(str, pattern, si, pi);
  }
}
