import java.util.*;
public class Stock_Span {
    public static void main(String[] args) {
        int ar[]={10,2,1,3,5,4,8,7};
        span(ar);
    }
    public static void span(int ar[]){
        int ans[]=new int[ar.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ar.length;i++){
            while(!st.isEmpty() && ar[i]>ar[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=i-st.peek();
            }
            else{
                ans[i]=i+1;
            }
            st.push(i);

        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
