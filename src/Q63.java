import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q63 {


  int count = 0;
  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);


  public void Insert(Integer num) {
    if (count % 2 == 0) {
      maxHeap.offer(num);
      int filteredMaxNum = maxHeap.poll();
      minHeap.offer(filteredMaxNum);
    } else {
      minHeap.offer(num);
      int filteredMinNum = minHeap.poll();
      maxHeap.offer(filteredMinNum);
    }
    count++;
  }

  public Double GetMedian() {
    if (count % 2 == 0) {
      return new Double((minHeap.peek() + maxHeap.peek())) / 2;
    } else {
      return new Double(minHeap.peek());
    }
  }
}
