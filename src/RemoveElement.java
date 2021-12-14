import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};

        int val = 2;

        int currentNum = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != val){
                nums[currentNum] = nums[i];
                currentNum++;
            }
        }

        System.out.println(currentNum+1);
        System.out.println(Arrays.toString(nums));

    }
}
