import java.util.LinkedList;
import java.util.Queue;

public class GraphLinkedList {
    private LinkedList<Integer>[] adj;
    private int E;
    private int V;
    public GraphLinkedList(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int u,int v)
    {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }
    public String toString()
    {
        StringBuilder S=new StringBuilder();
        S.append(V+"Vertics, "+E+"Edges"+"\n");
        for(int i=0;i<V;i++)
        {
            S.append(i+": ");
            for (int w:adj[i])
            {
                S.append(w+" ");
            }
            S.append("\n");
        }
        return S.toString();
    }
    public void bfs(int s) {
        boolean visited[] = new boolean[V];
        Queue<Integer>queue=new LinkedList<>();
        visited[s]=true;
        queue.offer(s);
        while(!queue.isEmpty())
        {
            int n=queue.poll();
            System.out.print(n+" ");
            for(int v:adj[n])
            {
                if(!visited[v])
                {
                    visited[v]=true;
                    queue.offer(v);
                }
            }

        }

    }
    public static void main(String args[])
    {
        GraphLinkedList g=new GraphLinkedList(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        //System.out.print(g);
        g.bfs(0);


    }
}
