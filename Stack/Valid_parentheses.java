import java.util.*;
public class Valid_parentheses{
    public static void main(String[] args) {
        String str = "({[}())";
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch==  '{' || ch ==  '['){
                s.push(ch);

            }else{ 
                if(s.isEmpty()){
                    System.out.println("Invalid");
                    return;
                }
            int top = s.pop();
            if(top == '(' && ch!=')' || 
                top =='{' && ch!='}'||
                top == '['&& ch!=']'
            ){
                System.out.println("Invaild");
                return;
            }

            
              
        }
    }   
    if(s.isEmpty()){
        System.out.println("Valid");
    }else{
        System.out.println("Invalid");
    }

    
}
}