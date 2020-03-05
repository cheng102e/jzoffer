/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q49 {

  public int StrToInt(String str) {
    if (str.equals("") || str.length() == 0) {
      return 0;
    }
    if (str.equals("-2147483648")) {
      return -2147483648;
    }
    char[] c = str.toCharArray();
    boolean flag = true;
    int sum = 0;
    for (char i : c) {
      if (i == '+') {
        continue;
      } else if (i == '-') {
        flag = false;
      } else if (i < 48 || i > 57) {
        return 0;
      } else {
        int temp = sum * 10 + i - 48;
        if (((temp - i + 48) / 10 != sum) || temp % 10 < 0) {
          return 0;
        }
        sum = temp;
      }
    }
    return flag ? sum : (-1) * sum;
  }
}
