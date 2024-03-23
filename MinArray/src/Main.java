public class Main {
    void minValue(int arr[],int n)
    {
        int j=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<j)
            {
                 j=arr[i];
            }
        }
        System.out.println(j);
    }
    public static void main(String[] args) {
       int arr[]=new int[]{4,2,5,7,5,4,9,3,1,3,5};
       int n= arr.length;
       Main main=new Main();
       main.minValue(arr,n);
    }
}