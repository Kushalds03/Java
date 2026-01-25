import java.util.Stack;
public class Reverse_Stack {
    public static void Push_at_bottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        Push_at_bottom(s, data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        Push_at_bottom(s, top);
    }
    public static void PrintStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
            
        }

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverseStack(s);
        PrintStack(s);
    }
}
