/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-27 21:35
 */
public class Q12 {

  public double Power(double base, int exponent) {
    if (exponent == 0) {
      return 1;
    }
    if (base == 0) {
      return 0;
    }
    double ans = 1;
    boolean flag = false;
    if (exponent > 0) {
      flag = true;
    } else {
      flag = false;
      exponent = -exponent;
    }
    for (int i = 1; i <= exponent; i++) {
      ans = ans * base;
    }
    if (!flag) {
      ans = 1.0 / ans;
    }
    return ans;
  }
}
