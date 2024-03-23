public class Main {
    public static long reverseInteger(int num)
    {
        boolean isNegative=num<0;
        if(isNegative)
        {
            num=num*-1;
        }
        long reverse=0;
        while(num>0)
        {
          int k=num%10;
          reverse=reverse*10+k;
          num=num/10;
        }
        long number=isNegative?reverse*-1:reverse;
        return number;
    }
    public static void main(String[] args) {
        int num=123134234;
        System.out.println(reverseInteger(num));
    }
}