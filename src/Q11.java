/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-26 18:15
 */
public class Q11 {

  public int NumberOf1(int n) {
    int count = 0;

    while (n != 0) {
      count++;
      n = (n - 1) & n;
    }
    return count;
  }
}
