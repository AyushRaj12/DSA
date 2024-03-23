public class Main {
    static int[] removeEven(int arr[])
    {
        int odd=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
           if(arr[i]%2!=0)
           {
             odd++;
           }
        }
        int newArr[]=new int[odd];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                newArr[j]=arr[i];
                j++;
            }
        }
        return newArr;
    }
    static void printArray(int arr1[])
    {
        int k=arr1.length;
        for(int i=0;i<k;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,5,6,7,9,3,6,5};
        printArray(removeEven(arr));
    }
}