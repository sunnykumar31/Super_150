import java.util.*;
public class ValidSubArray {
    public static void main(String[] args) {
        int ar[]={1,4,2,5,6,3};
        System.out.println(CountSubArray(ar));
    }
    public static int CountSubArray(int ar[]){
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ar.length;i++){
            // if(st.isEmpty()){
            //     st.push(ar[i]);
            // }
            // else{
                while(!st.isEmpty() && st.peek()>ar[i]){
                    st.pop();
                }
                st.push(ar[i]);
            // }
            count+=st.size();
        }
        return count;
    }
}
