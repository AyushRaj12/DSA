public class Main {
    public static    int linearSearch(int arr[],int n,int value)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==value)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,5,6,3,4,7,44,66,33};
        int n=arr.length;
        int value=44;
        System.out.println(linearSearch(arr,n,value));

    }
}