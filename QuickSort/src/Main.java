public class Main {
    public static int partition(int arr[],int low,int high)
    {
      int pivot=arr[high];
      int i=low;
      int j=low;
      while(i<=high)
      {
          if(arr[i]<= pivot)
          {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              j++;
          }
          i++;
      }
      return j-1;
    }
    public static void quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{-1,-4,5,3,8,7,4,9,-5,6};
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(arr[l]+" ");
        }
    }
}