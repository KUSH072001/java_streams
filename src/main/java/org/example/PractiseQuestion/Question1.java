package org.example.PractiseQuestion;

import java.util.Stack;

public class Question1 {

    public static  boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    };
    public static void main(String[] args) {

        String str="{}()[][]";
        boolean valid = isValid(str);
        System.out.println(valid);

    }
}
