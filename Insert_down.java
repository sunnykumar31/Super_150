import java.util.*;
public class Insert_down {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        insert(st,-3);
        System.out.println(st);
    }
    public static void insert(Stack<Integer> st,int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int a=st.pop();
        insert(st,val);
        st.push(a);
    }
}
