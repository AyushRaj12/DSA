public class Main {
    public void Zeroes(int arr[],int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0 && arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            if(arr[j]!=0)
            {
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int arr[] =new int[]{0,1,0,4,12};
        int n= arr.length;
        Main main=new Main();
        main.Zeroes(arr,n);
    }
}