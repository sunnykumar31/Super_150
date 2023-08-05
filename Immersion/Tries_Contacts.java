import java.util.HashMap;

public class Tries_Contacts {
    public class Node{
        char ch;
        HashMap<Character,Node> child=new HashMap<>();
        boolean isterminal=false;
        int count=0;
    }
    private Node root;
    public Tries_Contacts(){
        Node nn=new Node();
        nn.ch='*';
        this.root=nn;
    }
    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
                curr.count++;
            }
            else{
                Node nn=new Node();
                nn.ch=ch;
                curr.child.put(ch,nn);
                nn.count=1;
                curr=nn;
            }
        }
        curr.isterminal=true;
    }
    public int startWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(!curr.child.containsKey(ch)){
                return 0;
            }
            curr=curr.child.get(ch);
        }
        return curr.count;
    }
}
