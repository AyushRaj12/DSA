public class Main {
    public int maximumSum(int arr[],int n)
    {
       int currentMax=arr[0];
       int maxSoFar=arr[0];
       for(int i=1;i<n;i++)
       {
           currentMax=currentMax+arr[i];
           if(currentMax<arr[i])
           {
               currentMax=arr[i];
           }
           if(currentMax>maxSoFar)
           {
               maxSoFar=currentMax;
           }
       }
       return maxSoFar;
    }
    public static void main(String[] args) {
        Main main=new Main();
        int arr[]=new int[]{4,3,-2,6,-12,7,-1,6};
        int n=arr.length;
        System.out.println(main.maximumSum(arr,n));
    }
}