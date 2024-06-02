import java.util.Scanner;
import java.util.Stack;

public class Kalkulator {

    //solve the expression with brackets and operations using stack and bodmass rule and return the result as an integer
    static int solve(String s){
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                op.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                while(op.peek() != '('){
                    int a = st.pop();
                    int b = st.pop();
                    char c = op.pop();
                    int ans = 0;
                    if(c == '+'){
                        ans = a + b;
                    }else if(c == '-'){
                        ans = b - a;
                    }else if(c == '*'){
                        ans = a * b;
                    }else if(c == '/'){
                        ans = b / a;
                    }
                    st.push(ans);
                }
                op.pop();
            }else if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
                if(op.isEmpty()){
                    op.push(s.charAt(i));
                }else{
                    while(!op.isEmpty() && op.peek() != '(' && precedence(s.charAt(i)) <= precedence(op.peek())){
                        int a = st.pop();
                        int b = st.pop();
                        char c = op.pop();
                        int ans = 0;
                        if(c == '+'){
                            ans = a + b;
                        }else if(c == '-'){
                            ans = b - a;
                        }else if(c == '*'){
                            ans = a * b;
                        }else if(c == '/'){
                            ans = b / a;
                        }
                        st.push(ans);
                    }
                    op.push(s.charAt(i));
                }
            }else{
                st.push(s.charAt(i) - '0');
            }
        }
        while(!op.isEmpty()){
            int a = st.pop();
            int b = st.pop();
            char c = op.pop();
            int ans = 0;
            if(c == '+'){
                ans = a + b;
            }else if(c == '-'){
                ans = b - a;
            }else if(c == '*'){
                ans = a * b;
            }else if(c == '/'){
                ans = b / a;
            }
            st.push(ans);
        }
        return st.peek();
    }
    private static int precedence(char charAt) {
        if(charAt == '+' || charAt == '-'){
            return 1;
        }else if(charAt == '*' || charAt == '/'){
            return 2;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }
    
}
