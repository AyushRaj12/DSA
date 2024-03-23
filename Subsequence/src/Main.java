public class Main {
    public static boolean validSubsequence(String seq,String subSeq)
    {
        int i=0;
        int j=0;
        while(i<seq.length() && j<subSeq.length())
        {
            if(seq.charAt(i)==subSeq.charAt(j))
            {
                j++;
            }
            i++;
        }
        return j==subSeq.length();
    }
    public static void main(String[] args) {
        String seq="abcde";
        String subSeq="aed";
        System.out.println(validSubsequence(seq,subSeq));
    }
}