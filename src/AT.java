import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 17:45
 */
public class AT {
  public static String PrintMinNumber(int[] numbers) {
    StringBuffer str = new StringBuffer();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i:numbers) {
      list.add(i);
    }
    Collections.sort(list, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        String s1 = o1 + "" + o2;
        String s2 = o2 + "" + o1;
        return s1.compareTo(s2);
      }
    });
    for (int i:list){
      str.append(i);
    }
    return str.toString();
  }
  public static void main(String[] args) {
    int []num=new int[]{5,4,3,1,2};
    String n=PrintMinNumber(num);
    System.out.println(n);
  }
}
