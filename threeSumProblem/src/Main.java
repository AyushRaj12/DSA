import java.util.Arrays;

public class Main {
    public static void threeSumProblem(int arr[],int target)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            int j=i+1;
            int k=arr.length-1;
            int sum=0;
            while(j<k)
            {
                sum=arr[i]+arr[j]+arr[k];
                if(sum==target)
                {
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;
                    k--;
                }
                else if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,5,3,6,3,7,4};
        int target=10;
        threeSumProblem(arr,target);
    }
}