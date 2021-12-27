public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;

        int left = 0;
        int right = nums.length-1;

        while((right - left) > 1){
            int middle = (left +right) / 2;
            if(nums[middle]>= target){
                right = middle;
            }else{
                left = middle;
            }
        }

        if(nums[right]==target){
            System.out.println(right);
        }else{
            int diffRightAndTarget = nums[right]-target;
            int diffLeftAndTarget = target - nums[left];
            /*System.out.println("right and target " + diffRightAndTarget );
            System.out.println("left and target " + diffLeftAndTarget );*/
            if(diffRightAndTarget<=diffLeftAndTarget){
                System.out.println(right);
            }else{
                System.out.println(left);
            }
        }
    }
}
