public class Main {
    public void search(int arr[][],int n,int num)
    {
      int i=0;
      int j=n-1;
      while(i<n && j>=0)
      {
          if(arr[i][j]==num)
          {
              System.out.print("Value is present at "+i+","+j);
              return;
          }
          if(arr[i][j]<num)
          {
              i++;
          }
          else{
              j--;
          }
      }
      System.out.print("Not Found");

    }
    public static void main(String[] args) {
        Main main=new Main();
        int[][] arr=new int[][]{{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,51}};
        int n= arr.length;
        int num=32;
        main.search(arr,n,num);
    }
}