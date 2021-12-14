public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;

        int left = 0;
        int right = nums.length;

        while(right - left >= 1){
            int middle = (left +right) / 2;
            if(middle>= target){
                right = middle;
            }else{
                left = middle;
            }
        }
    }
}
