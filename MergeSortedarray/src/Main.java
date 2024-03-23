public class Main {
    public static void Merge(int arr1[],int arr2[],int a,int b,int c)
    {
        int arr3[]=new int[c];
        int i=0,j=0,k=0;
        while(i<a && j<b) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
            while(i<a)
            {
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            while(j<b)
            {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        for(int l=0;l<c;l++)
        {
            System.out.print(arr3[l]+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[]=new int[]{2,3,5,10};
        int arr2[]=new int[]{4,6,11,15};
        int a=arr1.length;
        int b=arr2.length;
        int c=a+b;
        Merge(arr1,arr2,a,b,c);
    }
}