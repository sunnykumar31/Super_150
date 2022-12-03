import java.util.*;

public class HistogramRectangle {
    public static void main(String[] args) {
        int ar[]={2,3,5,4,6,1,7};
        System.out.println(LargestArea(ar));
    }
    public static int LargestArea(int ar[]){
        Stack<Integer> sck=new Stack<>();
        int ans=0;
        for(int i=0;i<ar.length;i++){
            //if right minimum found then start findng area
            while(!sck.isEmpty() && ar[i]<ar[sck.peek()]){
                // finding the area 
                int right=i;
                int height=ar[sck.pop()];
                if(!sck.isEmpty()){
                    int left=sck.peek(); //left mimimum index;
                    ans=Math.max(ans,height*(right-left-1)); // r-l-1 is range for finding area
                }
                else{
                    ans=Math.max(ans,height*right);// no futher left mimimum thats why stack is empty;
                }
            }
            sck.push(i);
        }
        // if element is left in stack
        int right=ar.length;
        while(!sck.isEmpty()){
            int height=ar[sck.pop()];
            if(!sck.isEmpty()){
                int left=sck.peek(); //left mimimum index;
                ans=Math.max(ans,height*(right-left-1)); // r-l-1 is range for finding area
            }
            else{
                ans=Math.max(ans,height*right);// no futher left mimimum thats why stack is empty;
            }
        }
        return ans;
    }
}
