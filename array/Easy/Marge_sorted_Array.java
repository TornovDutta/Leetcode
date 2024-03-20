import java.util.Arrays;

//time complexity O(m+n);

public class Marge_sorted_Array {
    static void marge(int a[],int b[],int m,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                a[k]=a[i];
                i--;
            }else{
                a[k]=b[j];
                j--;
            }
            k--;
        }

        while(j>=0){
            a[k]=b[j];
            k--;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,0};
        int arr02[]={2,5,6};
        int n=3;
        int m=3;
        marge(arr,arr02,m,n);
        System.out.println(Arrays.toString(arr));
    }
}
