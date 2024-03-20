public class RemoveDuplicatesfromSortedArray {
    //time complexityO(n)
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesfromSortedArray sc=new RemoveDuplicatesfromSortedArray();
        int output= sc.removeDuplicates(arr);
        System.out.println("Answer is: "+output);
    }
}
