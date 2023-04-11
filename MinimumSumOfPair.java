import java.util.*;
public class MinimumSumOfPair {
    public static void main(String[] args) {
        int arr[]={4,8,2,1,5,4,3,6,12,23,10};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sum=0;
        while(pq.size()>1){
            int min1=pq.poll();
            int min2=pq.poll();
            sum=sum+min1+min2;
            pq.add(min1+min2);
        }
        System.out.println(sum);
    }
}
// ques 
// you have given an array .you have two select two element and sum of the selected element and
// push into array at the end you have remain only onne element in array you have to return minimimum sum of all the selected pairs.