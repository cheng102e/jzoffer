import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q23 {

  public boolean vt(int[] sequence, int start, int end) {
    if (start>=end) {
      return true;
    }
    int root = sequence[end];
    int mid = start;
    for (; mid < end; mid++) {
      if (root < sequence[mid]) {
        break;
      }
    }
    for (int i = mid; i < end; i++) {
      if (root > sequence[i]) {
        return false;
      }
    }
    boolean left = true;
    boolean right = true;
    if (start <= mid - 1) {
      left = vt(sequence, start, mid - 1);
    }
    if (mid <= end - 1) {
      right = vt(sequence, mid, end - 1);
    }
    return left && right;
  }

  public boolean VerifySquenceOfBST(int[] sequence) {
    if (sequence == null || sequence.length == 0) {
      return false;
    }
    if (sequence.length < 3) {
      return true;
    }
    return vt(sequence, 0, sequence.length - 1);
  }
}
