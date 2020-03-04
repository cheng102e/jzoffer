/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q31 {

  public int NumberOf1Between1AndN_Solution(int n) {
    StringBuffer str = new StringBuffer();
    for (int i = 1; i <= n; i++) {
      str.append(i);

    }
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }
}
