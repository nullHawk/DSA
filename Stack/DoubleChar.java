import java.util.Stack;

public class DoubleChar {
    //given a string remove all the consecutive duplicate characters recursively
    public static void main(String[] args){
        String s = "abaabcca";
        System.out.println(removedoubleChar(s));
    }
    static String removedoubleChar(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }else{
                if(st.peek() == s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        String ans = "";
        for(int i = 0; i < st.size(); i++){
            ans += st.get(i);
        }
        return ans;
    }
    
}
