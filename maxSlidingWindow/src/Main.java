import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static List<Integer>maxSlidingWindow(int arr[],int k)
    {
        int indexArr[]=getRightMax(arr);
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++)
        {
            int j=i;
            while(indexArr[j]<i+k)
            {
                j=indexArr[j];
            }
            result.add(arr[j]);
        }
        return result;
    }
    public static int[] getRightMax(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int result[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!st.isEmpty()){
                while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                {
                    st.pop();
                }
            }
            if(st.isEmpty())
            {
                result[i]=arr.length;
            }
            else
            {
                result[i]=st.peek();
            }
            st.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={10,23,43,12,45,67,23};
        int k=3;
        List arr1=maxSlidingWindow(arr,k);
        for(int i=0;i<arr1.size();i++)
        {
            System.out.print(arr1.get(i)+" ");
        }
    }
}