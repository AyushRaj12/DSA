public class Main {
    public static  void sort(int arr[],int n)
    {
        int i=0,j=0;
        while(i<=n)
        {
            if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==1)
            {
                i++;
            }
            else if(arr[i]==2)
            {
                swap(arr,i,n);
                n--;
            }
        }
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(arr[l]+" ");
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,0,2,0,1,1,0,2,1,2};
        int n=arr.length-1;
        sort(arr,n);
    }
}