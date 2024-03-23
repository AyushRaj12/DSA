public class Main {
    public static int[] productOfArray(int[] arr)
    {
        int result[]=new int[arr.length];
        int temp=1;
        for(int i=0;i<arr.length;i++)
        {
            result[i]=temp;
            temp=arr[i]*temp;
        }
        temp=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            result[i]=result[i]*temp;
            temp=temp*arr[i];
        }
        return result;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        int result[]=productOfArray(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}