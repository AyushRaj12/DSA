public class Main {
    void minValue(int arr[],int n)
    {
        int k=Integer.MIN_VALUE;
        int j=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>j)
            {
                j=arr[i];
            }
        }
        for (int i=0;i<n;i++)
        {
            if(arr[i]>k && arr[i]!=j )
            {
                k=arr[i];
            }
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,5,7,5,4,9,3,1,3,5};
        int n= arr.length;
        Main main=new Main();
        main.minValue(arr,n);
    }
}