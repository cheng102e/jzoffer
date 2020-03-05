import java.util.*;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 17:45
 */
public class AT {

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

  public static void main(String[] args) {
    String s1 = "aaa";
    String s2 = "ab*ac*a";

    char[] str = s1.toCharArray();
    char[] pattern = s2.toCharArray();
    boolean ans = match(str, pattern);
    System.out.println(ans);
  }
}
