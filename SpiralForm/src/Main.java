public class Main {
    public void spiral(int arr[][],int r,int c)
    {
        int k=0,l=0;
        while(k<r && l<c)
        {
         for(int i=l;i<c;i++)
         {
             System.out.print(arr[k][i]+" ");
         }
         k++;
         for(int i=k;i<r;i++)
         {
             System.out.print(arr[i][c-1]+" ");
         }
         c--;
         if(k<r) {
             for (int i = c - 1; i >= l; i--) {
                 System.out.print(arr[r - 1][i] + " ");
             }
             r--;
         }
         if(l<c) {
             for (int i = r - 1; i >= k; i--) {
                 System.out.print(arr[i][l]+" ");
             }
             l++;
         }
        }
    }
    public static void main(String[] args) {
        Main main=new Main();
        int[][] arr=new int[][]{{10,20,30,40},
                                {15,25,35,45},
                                {27,29,37,48},
                                {32,33,39,51}};
        int r= arr.length;
        int c=arr.length;
        main.spiral(arr,r,c);
    }
}