package medium;

public class Subarray_Product_Less_Than_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int count = 0;
        int product = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={10,5,2,6};
        int k=100;
        Subarray_Product_Less_Than_K sc=new Subarray_Product_Less_Than_K();
        System.out.println(sc.numSubarrayProductLessThanK(arr,k));
    }
}
