import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int ar[]={10,2,1,3,5,4,8,7};
        NGE(ar);
    }
    public static void NGE(int ar[]){
        int ans[]=new int[ar.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ar.length;i++){
            while(!st.isEmpty() && ar[i]>ar[st.peek()]){
                ans[st.pop()]=ar[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
