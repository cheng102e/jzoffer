import java.util.*;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 17:45
 */
public class AT {

  public static void main(String[] args) {
    int sum = 0;
    int i=38;
    while (i > 0) {
      sum += i % 10;
      i /= 10;
    }
    System.out.println(sum);
  }
}
