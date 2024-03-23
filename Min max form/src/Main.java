public class Main {
    public static void minMax(int arr[])
    {
       int maxIdx=arr.length-1;
       int minIdx=0;
       int max=arr[maxIdx]+1;
       for(int i=0;i<arr.length;i++)
       {
           if(i%2==0)
           {
               arr[i]=arr[i]+(arr[maxIdx]%max)*max;
               maxIdx--;
           }
           else
           {
               arr[i]=arr[i]+(arr[minIdx]%max)*max;
               minIdx++;
           }
       }
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=arr[i]/max;
           System.out.print(arr[i]+" ");
       }

    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        minMax(arr);
    }
}