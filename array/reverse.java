class reverse {
    public static void main(String[] args) {
        int arr[]={12,23,34,45};
        System.out.print("reverse array is:");
        int a[]=reversearr(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
    static int[] reversearr(int a[]){
        int start=0;
        int end=a.length-1;
        for (int i = 0; i < a.length-1; i++) {
            swap(a[start],a[end]);
            start++;
            end--;
        }

        return a;

    }
    static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
    }
}
