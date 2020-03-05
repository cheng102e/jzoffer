import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q54 {

  HashMap<Character, Integer> map = new HashMap<>();
  ArrayList<Character> list = new ArrayList<>();

  public void Insert(char ch) {
    if (map.containsKey(ch)) {
      map.put(ch, map.get(ch) + 1);
    } else {
      map.put(ch, 1);
    }

    list.add(ch);
  }

  public char FirstAppearingOnce() {
    char c = '#';
    for (char key : list) {
      if (map.get(key) == 1) {
        c = key;
        break;
      }
    }
    return c;
  }

}
