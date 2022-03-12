/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 9:13
 */
public class JZ11 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] == numbers[right]) {
                right--;
            }
        }
        return numbers[left];
    }
}
