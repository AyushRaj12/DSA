import java.util.Set;

public class Main {
    public static String removeVowels(String str)
    {
        Set<Character> vowels=Set.of('a','e','i','o','u');
        StringBuilder sb=new StringBuilder();
        char chr[]=str.toCharArray();
        for(char c:chr)
        {
            if(!vowels.contains(c))
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        String str="ice cream";
        System.out.println(removeVowels(str));
    }
}