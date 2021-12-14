import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = new int[]{9, 8,9, 9};


        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]<9){
                nums[i] = nums[i]+1;
                System.out.println(Arrays.toString(nums));
                break;
            }else{
                nums[i] =0;
            }
        }
        int []arr =new int[nums.length+1];
        arr[0]=1;

       // System.out.println(Arrays.toString(arr));

//        long sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            long myLong = nums[i];
//            for (int power = 1; power < nums.length - i; power++) {
//                myLong = myLong * 10;
//            }
//            sum = sum + myLong;
//            //System.out.println(sum);
//        }
//        sum++;
//        //System.out.println(sum);
//        String res = String.valueOf(sum);
//        int[] res1 = new int[res.length()];
//
//        for (int i = 0; i < res.length(); i++) {
//            res1[i] = Integer.parseInt(String.valueOf(res.charAt(i)));
//        }
//        System.out.println(Arrays.toString(res1));

    }
}
