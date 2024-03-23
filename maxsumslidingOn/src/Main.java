public class Main {
    public static int maxSumSliding(int arr[],int k)
    {
        int windowSum=0;
        int sum=0;
        int start=0;
        for(int i=0;i<arr.length;i++)
        {
            windowSum=windowSum+arr[i];
            if(i>=k-1)
            {
               sum=Math.max(sum,windowSum);
               windowSum=windowSum-arr[start];
               start++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={2,7,3,5,8,1};
        int k=3;
        System.out.print(maxSumSliding(arr,k));
    }
}