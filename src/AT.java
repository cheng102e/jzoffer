/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 17:45
 */
public class AT {
  public static String replaceSpace(StringBuffer str) {
    StringBuffer ans = new StringBuffer();
    for (int i = 0; i < str.length(); i++) {
   //   System.out.println(str.charAt(i));
      if (str.charAt(i) != ' ') {
        ans.append(str.charAt(i));
      } else {
        ans.append("%20");
      }
    }
    return ans.toString();
  }
  public static void main(String[] args) {
    StringBuffer ans = new StringBuffer("hello world");
    System.out.println(replaceSpace(ans));
  }
}
