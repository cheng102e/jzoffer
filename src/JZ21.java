/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 15:52
 */
public class JZ21 {
    public int[] exchange(int[] nums) {
        int fast = 0, slow = 0;
        int len = nums.length;
        while (fast < len) {
            if (nums[fast] % 2 == 1) {
                int tmp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = tmp;
                slow++;
            }
            fast++;
        }
        return nums;
    }
}
