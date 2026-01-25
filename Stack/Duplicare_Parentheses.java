import java.util.*;
public class Duplicare_Parentheses {
    public static boolean isDuplicate(String str1){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str1.length();i++){
            char ch  = str1.charAt(i);
            // closing
            if(ch==')'){
                int count = 0;
                while(s.pop()!='('){
                
                    count++;

                }
                if(count<1){
                    return true; //duplicate exist  
                }
            }else{
                // opening, operator and operands
                s.push(ch);

            }

        }
        return false;

    }
    public static void main(String[] args) {
        String str1 = "((a+b))";  // true(Duplicate is present)
        String str2 = "(a+b)";   // false(Duplicate is not present)
        System.out.println(isDuplicate(str2));
    }
}
