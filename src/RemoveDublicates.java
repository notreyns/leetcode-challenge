import java.util.Arrays;

public class RemoveDublicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int order = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[order] == nums[i]) {
                continue;
            } else {
                order++;
                nums[order] = nums[i];

            }
            //System.out.println(Arrays.toString(nums) + i + "times");
        }
        System.out.println(Arrays.toString(nums));
    }

}

