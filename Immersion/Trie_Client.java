public class Trie_Client{
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("raj");
        t.insert("ankit");
        t.insert("ankita");
        t.insert("apple");
        t.insert("mango");
        System.out.println(t.search("mango"));
        System.out.println(t.startWith("app"));
    
    }
}