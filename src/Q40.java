import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q40 {

  public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

    HashSet<Integer> set = new HashSet<>();

    for (int i : array) {
      if (set.contains(i)) {
        set.remove(i);
      } else {
        set.add(i);
      }
    }
    int[] t = new int[2];
    int temp = 0;
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      t[temp++] = iterator.next();
    }
    num1[0] = t[0];
    num2[0] = t[1];
  }
}
