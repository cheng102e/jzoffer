/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q44 {

  public void reverse(char[] c, int start, int end) {
    while (start < end) {
      char temp = c[start];
      c[start++] = c[end];
      c[end--] = temp;
    }
  }

  public String ReverseSentence(String str) {
    int len = str.length();

    char[] c = str.toCharArray();
    reverse(c, 0, len - 1);
    int index = -1;
    for (int i = 0; i < len; i++) {
      if (c[i] == ' ') {
        reverse(c, index + 1, i - 1);
        index = i;
      }
    }
    reverse(c, index + 1, len - 1);

    return new String(c);
  }
}
