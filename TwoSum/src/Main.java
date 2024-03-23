import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static int[] twoSum(int arr[],int target)
    {
        int result[]=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(target-arr[i]))
            {
                map.put(arr[i],i);
            }
            else
            {
                result[0]=arr[i];
                result[1]=arr[map.get(target-arr[i])];
                System.out.println(result[0]+" "+result[1]);
            }
        }
       /* Iterator it=map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry entry=(Map.Entry) it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
        return result;
    }
    public static int[] twoSum1(int arr[],int target)
    {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int result[]=new int[2];
        int sum;
        while(left<right)
        {
           sum=arr[left]+arr[right];
           if(sum==target)
           {
               result[0]=arr[left];
               result[1]=arr[right];
               return result;
           }
           else if(sum<target)
           {
               left++;
           }
           else {
               right--;
           }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,3,6,5,4,7,8};
        int target=9;
        int result[]=twoSum(arr,target);
        System.out.println(result[0]+" and "+result[1]);
    }
}