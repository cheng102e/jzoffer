import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q28 {

  public int MoreThanHalfNum_Solution(int[] array) {
    if (array == null || array.length == 0) {
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      if (map.containsKey(array[i])) {
        int count = map.get(array[i]);
        map.put(array[i], ++count);
      } else {
        map.put(array[i], 1);
      }
    }

    Iterator iter = map.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) iter.next();
      if (entry.getValue() > array.length / 2) {
        return entry.getKey();
      }
    }
    return 0;
  }
}
