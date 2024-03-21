package Easy;

import java.util.Arrays;

//time complexity O(n)
class Chocolate_Distribution {
    static int distribution(int a[],int m){
        Arrays.sort(a);
        int n=Integer.MAX_VALUE;
        for (int i = 0; i < a.length-m; i++) {
            n=Math.min(n,a[i + m - 1] - a[i]);
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
        int m=5;
        int ans=distribution(arr,m);
        System.out.println(ans);

    }
}
