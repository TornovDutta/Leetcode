package medium;
import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_Array {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        // Restore the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return duplicates;
    }

    public static void main(String[] args) {
        Find_All_Duplicates_in_Array sc=new Find_All_Duplicates_in_Array();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = sc.findDuplicates(nums);
        System.out.println("Duplicate elements: " + duplicates);
    }
}
