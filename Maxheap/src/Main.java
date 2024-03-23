

public class Main {
    private Integer[] heap;
    private int n;
    public Main(int capacity)
    {
        heap=new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty()
    {
        return n==0;
    }
    public int size()
    {
        return n;
    }
    public void insert(int value)
    {
        if(n==heap.length-1)
        {
            resize(2*heap.length);
        }
        n++;
        heap[n]=value;
        swim(n);
    }
    private void resize(int capacity)
    {
        Integer[] temp=new Integer[capacity];
        for(int i=0;i<heap.length;i++)
        {
            temp[i]=heap[i];
        }
        heap=temp;
    }
    private void swim(int k)
    {
       while(k>1 && heap[k/2]<heap[k])
       {
           int temp=heap[k];
           heap[k]=heap[k/2];
           heap[k/2]=temp;
           k=k/2;
       }
    }

    public int deleteMax()
    {
       int max=heap[1];
       swap(1,n);
       n--;
       sink(1);
       heap[n+1]=null;
       if(n>0 && n==(heap.length-1)/4)
       {
           resize(heap.length/2);
       }
       return max;
    }
    public void sink(int k)
    {
        while(2*k<=n)
        {
            int j=2*k;
            if(j<n && heap[j]<heap[j+1])
            {
                j++;
            }
            if(heap[k]>=heap[j])
            {
                break;
            }
            swap(k,j);
            k=j;
        }
    }
    public void swap(int a,int b)
    {
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
    public void printMaxheap()
    {
        for(int i=0;i<heap.length;i++)
        {
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      Main main=new Main(3);
      System.out.println(main.isEmpty());
      System.out.println(main.size());
      main.insert(4);
      main.insert(5);
      main.insert(8);
      main.insert(3);
      main.insert(9);
      main.insert(6);
      main.insert(7);
      main.printMaxheap();
      System.out.println(main.deleteMax());
      main.printMaxheap();
      System.out.println(main.isEmpty());
      System.out.println(main.size());
    }
}