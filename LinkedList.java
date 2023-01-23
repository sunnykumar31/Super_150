public class LinkedList {
    class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    public int size;
    // Add first TC O(1);
    public void AddFirst(int item){
        Node nn=new Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
            this.size++;
        }
        else{
            nn.next=head;
            head=nn;
            this.size++;
        }
    }
    // Adding node in last ,TC O(1);
    public void AddLast(int item){
        Node nn=new Node();
        nn.val=item;
        if(size==0){
            AddFirst(item);
        }
        else{
            tail.next=nn;
            tail=nn;
            this.size++;
        }
    }
    // Adding element At any Index ,TC(index-1);
    public void AddAtIndex(int item,int index) throws Exception{
        Node nn=new Node();
        nn.val=item;
        if(index<0 || index>size){
            throw new Exception("index range m do!");
            // return;
        }
        if(index==0){
            AddFirst(item);
            return;
        }
        if(index==size){
            AddLast(item);
            return;
        }
        int count=0;
        Node temp=head;
        while(count<index-1){
            temp=temp.next;
            count++;
        }
        nn.next=temp.next;
        temp.next=nn;
        this.size++;

    }
    // delete first node TC O(1);
    public void DeleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            this.size--;
            return;
        }
        head=head.next;
        this.size--;
    }

    // delete last node TC(size);
    public void DeleteLast(){
        if(size==0){
            return;
        }
        if(size==1){
            head=null;
            tail=null;
            this.size--;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        this.size--;
        // System.out.println(this.size);
    }
    // delete node by index TC(index)
    public void DeleteAtAnyIndex(int index) throws Exception {
        if(index<0 || index>=size){
            throw new Exception("index range m to do ");
            // return;
        }
        if(index==0){
            DeleteFirst();
            return;
        }
        if(index==size-1){
            DeleteLast();
            return;
        }
        int count=0;
        Node temp=head;
        while(count<index){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        this.size--;
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

}
