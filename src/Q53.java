/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q53 {

  public boolean isNumeric(char[] str) {
    String que=String.valueOf(str);
    return  que.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
  }
}
