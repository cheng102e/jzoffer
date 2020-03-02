import java.util.Arrays;

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
    Arrays.sort(array);
    return array[(array.length - 1) / 2];
  }
}
