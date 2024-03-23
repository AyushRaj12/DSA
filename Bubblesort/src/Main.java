public class Main {
    public static void bubbleSort(int arr[],int n)
    {
        boolean isSwapped;
        for(int i=0;i<n-1;i++)
        {
            isSwapped=false;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,5,6,3,4,7,44,66,33};
        int n=arr.length;
        bubbleSort(arr,n);

    }
}