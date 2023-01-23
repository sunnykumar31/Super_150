
public class LinkedList_clinet {
    public static void main(String[] args) throws Exception{
        LinkedList ll=new LinkedList();
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddLast(10);
        ll.AddAtIndex(20, 2);
        ll.Display();
        ll.DeleteFirst();
        ll.DeleteLast();
        ll.Display();
        ll.AddAtIndex(9, 2);
        ll.AddAtIndex(8, 2);
        ll.AddFirst(-10);
        ll.Display();
        ll.DeleteAtAnyIndex(1);
        ll.Display();
        ll.DeleteAtAnyIndex(0);
        ll.Display();
        ll.DeleteAtAnyIndex(8);
        ll.Display();
        System.out.println(ll.size);
    }
}
