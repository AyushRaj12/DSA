public class Main {
    public void reverseArr(int arr[],int n)
    {
        int j=n-1;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,3,5,2,8,3,6,8,7};
        int n=arr.length;
        Main main=new Main();
        main.reverseArr(arr,n);
    }
}