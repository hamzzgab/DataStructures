package com.company.stack;

public class Balancing{
    static String string_exp = "{()}";
    final int MAX=string_exp.length();
    int top = -1;
    char[] arr = new char[MAX];
    char val;

    void print(String str){
        System.out.println(str);
    }

    void push(char val){
        if (isFull()){
            print("Overflow");
        }else {
            top = top + 1;
            arr[top] = val;
        }
    }

    boolean isFull(){
        if (top == MAX-1){
            return true;
        }else return false;
    }


    boolean isEmpty(){
        if (top == -1){
            return true;
        }else return false;
    }

    char pop(){
        if (!isEmpty()){
            val = arr[top];
            top = top - 1;
            return val;
        }
        return 0;
    }

    boolean check_balance(String exp){
       for (int i = 0; i < exp.length(); i++){

           char c = exp.charAt(i);

           if (c == '{' || c == '(' || c == '['){
               push(c);
           }

           if(isEmpty()) {
               return false;
           }else{
               char check;
               switch (c) {
                   case '}':
                       check = pop();
                       if (check == '[' || check == '(') {
                           return false;
                       }
                   case ')':
                       check = pop();
                       if (check == '{' || check == '[') {
                           return false;
                       }
                   case ']':
                       check = pop();
                       if (check == '{' || check == '(') {
                           return false;
                       }
               }
           }
       }
        return isEmpty();
    }

    public static void main(String[] args){

        Balancing s = new Balancing();

        if (s.check_balance(string_exp)){
            s.print("\nBalanced");
        }else s.print("\nUnbalanced");
    }
}
