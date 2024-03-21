package Easy;

//time complexity O(n)
public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int arr[]={3,2,2,3};
        Remove_Element sc=new Remove_Element();
        System.out.println(sc.removeElement(arr,3));
    }
}
