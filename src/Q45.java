import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q45 {

  public boolean isContinuous(int[] numbers) {
    if (numbers == null || numbers.length < 5) {
      return false;
    }
    Arrays.sort(numbers);
    Set<Integer> set = new HashSet<>();
    int max = 0, min = 14;
    for (int i : numbers) {
      if (i != 0) {
        if (set.contains(i)) {
          return false;
        } else {
          max = Math.max(max, i);
          min = Math.min(min, i);
          set.add(i);
        }
      }
    }
    if (max - min < 5) {
      return true;
    }
    return false;
  }
}
