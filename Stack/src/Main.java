import java.util.Stack;

public class Main {
    private ListNode top;
    private int length;
    private class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
        }
    }
    public int length()
    {
        return length;
    }
    public Main()
    {
        top=null;
        length=0;
    }
    public void push(int data)
    {
        ListNode newNode=new ListNode(data);
        newNode.next=top;
        top=newNode;
        length++;
    }
    public void display()
    {
        ListNode temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public int pop()
    {
        ListNode temp=top;
        int result=temp.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek()
    {
        return top.data;
    }

    public static String reverse(String str)
    {
        Stack<Character>stack=new Stack<>();
        char[] chars=str.toCharArray();
        for(char c : chars)
        {
            stack.push(c);
        }
        for(int i=0;i<str.length();i++)
        {
            chars[i]=stack.pop();
        }
        return new String(chars);
    }
    public static int[] greaterElement(int arr[])
    {
       Stack<Integer>stack=new Stack<>();
       int result[]=new int[arr.length];
       for(int i=arr.length-1;i>=0;i--)
       {
           if(!stack.isEmpty())
           {
               while(!stack.isEmpty()&&stack.peek()<=arr[i])
               {
                   stack.pop();
               }
           }
           if(stack.isEmpty())
           {
               result[i]=-1;
           }
           else
           {
               result[i]=stack.peek();
           }
           stack.push(arr[i]);
       }
       return result;
    }


    public static boolean parenthesis(String s)
    {
        Stack<Character>stack=new Stack<>();
        char[] chars=s.toCharArray();
        for(char c : chars)
        {
            if(c=='('||c=='{'||c=='[')
            {
               stack.push(c);
            }
            else
            {  if(stack.isEmpty())
            {
                return false;
            }
            else {
                char top = stack.peek();
                if (c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.push(1);
        main.push(2);
        main.push(3);
        main.push(4);
        main.push(5);
        main.display();
        System.out.println(main.pop());
        main.display();
        System.out.println(reverse("abcd"));
        int arr[]=new int[]{4,7,3,4,8,1};
        int arr1[]=greaterElement(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println(parenthesis("{([])}]"));

    }
}