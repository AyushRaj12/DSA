import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int nonRepeatingCharacter(String str)
    {
        Map<Character,Integer> map=new HashMap<>();
        char chr[]=str.toCharArray();
        for(char ch:chr)
        {
           map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<chr.length;i++)
        {
            int ch=map.get(chr[i]);
            if(ch==1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="codeforcode";
        char ch[]=str.toCharArray();
        System.out.println(ch[nonRepeatingCharacter(str)]+" at position "+nonRepeatingCharacter(str));
    }
}