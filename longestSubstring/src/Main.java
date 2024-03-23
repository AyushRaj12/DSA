import java.util.HashMap;

public class Main {
    public static int longestSubstring(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++)
        {
            char chr=s.charAt(i);
            if(map.containsKey(chr))
            {
                start=Math.max(map.get(chr)+1,start);
            }
            map.put(chr,i);
            maxLength=Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str="pwwkew";
        System.out.print(longestSubstring(str));
    }
}