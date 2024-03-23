public class Main {
    public static void selectionSort(int arr[],int n)
    {
       for(int i=0;i<n;i++)
       {
           int min=i;
           for(int j=i+1;j<n;j++)
           {
               if(arr[j]<arr[min])
               {
                   min=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
       }
     for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,5,6,3,4,7,44,66,33};
        int n=arr.length;
        selectionSort(arr,n);
    }
}