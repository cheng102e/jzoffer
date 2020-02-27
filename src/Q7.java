/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-26 15:48
 */
public class Q7 {

  public static  int Fibonacci(int n) {
    int a0 = 0;
    int a1 = 1;
    int a2 = 0;
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    for (int i = 2; i <= n; i++) {
      a2 = a0 + a1;
      a0 = a1;
      a1 = a2;
    }
    return a2;
  }
}
