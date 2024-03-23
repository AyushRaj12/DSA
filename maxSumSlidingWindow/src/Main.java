
public class Main {
    public static int maxSumSliding(int arr[],int k)
    {
        int a=-1;
        for(int i=0;i<=arr.length-k;i++)
        {
            int sum=0;
            int j=i;
            while(j<i+k)
            {
                sum=sum+arr[j];
                j++;
            }
            if(sum>a)
            {
                a=sum;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={2,7,3,5,8,1};
        int k=3;
        System.out.print(maxSumSliding(arr,k));
    }
}