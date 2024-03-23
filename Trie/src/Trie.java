public class Trie {

    private TrieNode root;
    public Trie(){
       root = new TrieNode();
    }
    private class TrieNode {
      private TrieNode[] children;
      private boolean isWord;

      public TrieNode(){
          this.children = new TrieNode[26];
          this.isWord=false;
      }
    }
    public void insert(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            int c=word.charAt(i);
            int index=c-'a';
            if(current.children[index]==null)
            {
                TrieNode node=new TrieNode();
                current.children[index]=node;
                current=node;
            }
            else {
                current=current.children[index];
            }
        }
        current.isWord=true;
    }

    public boolean search(String word)
    {
        TrieNode current=root;
        int length=word.length();
        for(int i=0;i<length;i++)
        {
            int c=word.charAt(i)-'a';
            if(current.children[c]==null)
                return false;
            current=current.children[c];
        }
        return (current.isWord);
    }
    public static void main(String[] args)
    {
      Trie trie=new Trie();
      trie.insert("cat");
      trie.insert("cab");
      trie.insert("son");
      trie.insert("so");
      System.out.println(trie.search("cal"));

    }
}
