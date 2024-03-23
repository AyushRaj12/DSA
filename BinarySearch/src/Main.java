public class Main {
    public static int binarySearch(int arr[],int n,int value)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==value)
            {
                return mid;
            }
            if(value<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,5,6,7,8,9,10,11,12};
        int n=arr.length;
        int value=9;
        System.out.println(binarySearch(arr,n,value));
    }
}