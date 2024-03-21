class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[l]<=nums[mid]){
                if(nums[l]<=target && target<=nums[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5};
        int target=8;
        SearchinRotatedSortedArray sc=new SearchinRotatedSortedArray();

        int idx= sc.search(arr,target);
        if(idx==-1){
            System.out.println("unsuccessful");
        }else{
            System.out.println("successful ,index at "+idx);
        }
    }
}