import java.util.*;
import java.util.Map.Entry;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q34 {

  public int FirstNotRepeatingChar(String str) {
    if (str == null || str.length() == 0) {
      return -1;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    StringBuffer que = new StringBuffer(str);
    for (int i = 0; i < que.length(); i++) {
      char temp = que.charAt(i);
      if (map.containsKey(temp)) {
        int num = map.get(temp);
        map.put(temp, ++num);
      } else {
        map.put(temp, 1);
      }
    }
    for (int i = 0; i < que.length(); i++) {
      if (map.get(que.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
