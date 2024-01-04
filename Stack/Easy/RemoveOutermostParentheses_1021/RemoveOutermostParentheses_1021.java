import java.util.Stack;

public class RemoveOutermostParentheses_1021 {
    public static void main(String[] args) {

        sol1("(()())(())");

    }

    private static String sol1(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(int i=0;i<s.length();i++){

            System.out.println("i = " + i);

            if(s.charAt(i)=='('){

                if(stack.size()>=1){

                    res.append(""+s.charAt(i));

                    System.out.println("res.append : " + res.toString());

                }

                stack.push(s.charAt(i));

                System.out.println("stack After Push is : " + stack.toString());

            }else{

                if(stack.size()>1){

                    System.out.println("else condition ");

                    res.append(""+s.charAt(i));

                    System.out.println("res.append : " + res.toString());

                }

                stack.pop();

                System.out.println("Stack After POP is: " + stack.toString());

            }
            System.out.println("--------------------------------------------------");
        }

        System.out.println("Result is : " + res.toString());
        System.out.println("Stack is : " + stack.toString());
        return res.toString();
    }
}
