public class Twosum {
    //time complexity o(n^2)
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
          for(int i=0;i<n-1;i++){
              for(int j=i+1;j<n;j++){
                  if(nums[i]+nums[j]==target){
                      return new int[]{i,j};
                  }
              }
          }
           return new int[]{};  
      }
      public static void main(String[] args) {
        Twosum twosum = new Twosum();
        int arr[]={2,7,11,15};
        int t=9;
        int[] result = twosum.twoSum(arr, t);
        System.out.println("Answer is:"+ result[0] + ", " + result[1]);
      }
    
}
