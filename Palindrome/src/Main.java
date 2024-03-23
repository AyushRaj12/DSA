public class Main {
    public Boolean Palindrome(char arr[],int n)
    {
        int j=n-1;
        for(int i=0;i<n/2;i++)
        {
            if(arr[i]!=arr[j])
            {
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String Name="123321";
        char arr[]=Name.toCharArray();
        int n=arr.length;
        Main main=new Main();
        System.out.println(main.Palindrome(arr,n));
    }
}