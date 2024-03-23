public class Main {
    public static void square(int arr[],int n)
    {
        for(int i=0;i<=n;i++) {
            arr[i] = arr[i] * arr[i];
        }
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
    public static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low;
        int j=low;
        while(i<=high)
        {
            if(arr[i]<=pivot)
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
    public static int[] sortedSquares(int arr[],int n)
    {
        int result[]=new int[n+1];
        int i=0;
        int j=n;
        for(int k=n;k>=0;k--)
        {
            if(Math.abs(arr[i])>Math.abs(arr[j]))
            {
                result[k]=arr[i]*arr[i];
                i++;
            }
            else {
                result[k]=arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{-7,-4,-1,2,3,5,8,9};
        int low=0;
        int high=arr.length-1;
        //square(arr,high);
        //quickSort(arr,low,high);
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(arr[l]+" ");
        }
        System.out.println();
        int result[]=sortedSquares(arr,high);
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(result[l]+" ");
        }
    }
}