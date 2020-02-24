/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 19:00
 */
public class Q2 {

  //替换空格
  public String replaceSpace(StringBuffer str) {
    StringBuffer ans = new StringBuffer();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        ans.append(str.charAt(i));
      } else {
        ans.append("%20");
      }
    }
    return ans.toString();
  }

  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
