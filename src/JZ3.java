/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/11 21:48
 */
public class JZ3 {
    public int findRepeatNumber(int[] nums) {
        int i = 0, len = nums.length;
        //索引和数一一对应，如果有重复数字，该索引就有不止一个数对应
        while (i < len) {
            //只有当索引等于值时，才到下一步
            if (nums[i] == i) {
                i++;
                continue;
            }
            //此时同时出现两个相同数，返回
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            //交换数字到正确的索引位置，继续比较当前位
            int tmp = nums[i];
            nums[i] = nums[nums[i]];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
