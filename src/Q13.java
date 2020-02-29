/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-28 10:31
 */
public class Q13 {

  public void reOrderArray(int[] array) {
    int[] newarray = new int[array.length];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 1) {
        newarray[index] = array[i];
        index++;
      }
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        newarray[index] = array[i];
        index++;
      }
    }
    for (int i = 0; i < array.length; i++) {
      array[i] = newarray[i];
    }
  }
}
