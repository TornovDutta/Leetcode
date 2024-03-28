package medium;

import java.util.Arrays;

public class First_and_Last_Position_of_Element_in_Sorted_Array {

    //time complexity O(logn)

     int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0)
            return result;

        // Search for the left boundary
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] != target)
            return result; // Target not found

        result[0] = left;

        // Search for the right boundary
        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2 + 1; // Ensure mid is biased to the right
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        result[1] = left;

        return result;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int k=8;
        First_and_Last_Position_of_Element_in_Sorted_Array sc=new First_and_Last_Position_of_Element_in_Sorted_Array();
        System.out.println(Arrays.toString(sc.searchRange(arr,k)));

    }
}
