public class Main {
    public static void insertionSort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int[] arr=new int[]{-1,3,-5,6,3,-2,7,44,66,33};
        int n=arr.length;
        insertionSort(arr,n);
    }
}