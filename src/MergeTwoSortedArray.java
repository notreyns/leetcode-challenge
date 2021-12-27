import java.util.Arrays;

class MergeTwoSortedArray{
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3,0, 0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;


        int end1 = m-1;
        int end2 = n-1;
        int result = m+n-1;
        while(end1>= 0 && end2>=0){
            if(nums2[end2]>= nums1[end1]){
                nums1[result] = nums2[end2];
                end2--;
            }else{
                nums1[result] = nums1[end1];
                end1--;
            }
            result--;
            //System.out.println(Arrays.toString(nums1));
        }

        if( m ==0){
            for(int i =0; i<nums2.length; i++){
                nums1[i] = nums2[i];
            }
        }
       // System.out.println(Arrays.toString(nums1));
    }
}