//time complexity_0(n)
class Max_min
{ 
    public static int findSum(int A[],int N) 
    {
        int min=Integer. MAX_VALUE;
        int max=Integer. MIN_VALUE;
        
        for (int i=0;i<N;i++) {
             min=Math.min(min,A[i]);
             max=Math.max(max,A[i]);
        }
        return max+min;
    }
    public static void main(String[] args) {
        int arr[]={-2, 1, -4, 5, 3};
        int n=5;
        int ans=findSum(arr, n);
        System.out.println("answer is:"+ans);
    }
}
