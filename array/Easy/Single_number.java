package Easy;

public class Single_number {
    public int singleNumber(int[] nums) {
        int result = 0;

        // XOR all elements in the array
        for (int num : nums) {
            result ^= num;
        }

        return result;

    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        Single_number sc=new Single_number();
        System.out.println(sc.singleNumber(arr));
    }
}
