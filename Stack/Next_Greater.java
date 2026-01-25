import java.util.*;
public class Next_Greater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int next_Greater[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            // 1 while 
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            // 2 if-else
            if(s.isEmpty()){
                next_Greater[i] = -1;
            }else{
                next_Greater[i] = arr[s.peek()];   // to store  the index
            }
             

            // 3 push in s 
             s.push(i);

        }
        for(int i =0 ;i<next_Greater.length;i++){
            System.out.print(next_Greater[i]+" ");
        }
        System.out.println();
    }
    
}
