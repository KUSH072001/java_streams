package org.example.PractiseQuestion;

import java.util.Stack;

public class Demo2 {

       public static boolean isPrasent(String str){
           Stack<Character> stack=new Stack<>();
               for(char c:str.toCharArray()){

                   if(c=='('||c=='{'||c=='['){
                       stack.push(c);
                   }else {
                        if(stack.isEmpty()){
                            return  false;
                        }
                        char top=stack.pop();
                        if((c==')'&& top!='(')||(c=='}'&&top!='{')||(c==']'&&top!='[')){
                            return false;
                       }
                   }
           }
           return  true;

       }


    public static void main(String[] args){
                String str = "{}[]{}";
                boolean b=isPrasent(str);
            System.out.println(b);
            }
}
