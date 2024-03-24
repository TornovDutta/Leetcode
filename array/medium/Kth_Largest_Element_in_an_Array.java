package medium;



import java.util.Arrays;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(arr,k));
    }
    static int findKthLargest(int nums[],int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
