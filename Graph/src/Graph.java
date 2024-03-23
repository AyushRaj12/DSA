public class Graph{
    private int E;//no. of edges
    private int V;//no of vertices
    private int[][] adjmatrix;
    public Graph(int nodes) {
        this.V=nodes;
        this.E=0;
        this.adjmatrix = new int[nodes][nodes];
    }
    public void addEdge(int u,int v)
    {
        this.adjmatrix[u][v]=1;
        this.adjmatrix[v][u]=1;
        E++;
    }
   public String toString()
    {
        StringBuilder S=new StringBuilder();
        S.append(V+"Vertics, "+E+"Edges"+"\n");
        for(int i=0;i<V;i++)
        {
            S.append(i+": ");
            for (int w:adjmatrix[i])
            {
                S.append(w+" ");
            }
            S.append("\n");
        }
        return S.toString();
    }
    public static void main(String args[])
    {
       Graph g=new Graph(4);
       g.addEdge(0,1);
       g.addEdge(1,2);
       g.addEdge(2,3);
       g.addEdge(3,0);
       System.out.print(g);
    }
}
