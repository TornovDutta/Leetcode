class ContainDuplication {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainDuplication obj = new ContainDuplication(); // Create an instance
        int arr[] = {1, 2, 3, 1};
        System.out.println("There is any contain duplicate: " + obj.containsDuplicate(arr));
    }
}
