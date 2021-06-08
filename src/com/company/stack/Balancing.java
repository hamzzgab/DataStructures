package com.company.stack;

class Balancing{
    char val;
    int top = -1;
    final int MAX = 10;
    char[] arr = new char[MAX];

    void push(char val){
        if (!isFull()){
            top = top + 1;
            arr[top] = val;
        }
    }

    char pop(){
        if (!isEmpty()){
            val = arr[top];
            top--;
            return val;
        }
        return 0;
    }

    boolean isEmpty(){
        if (top == -1){
            return true;
        }else return false;
    }

    boolean isFull(){
        if (top == MAX-1){
            return true;
        }else return false;
    }

    boolean check_balance(String exp){
        for (int i = 0; i<exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == 'C' || c == '{' || c == '['){
                push(c);
                continue;
            }

            if (isEmpty()){
                return false;
            }
            char check;
            switch (c) {
                case ')':
                    check = pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;
            }
        }
        return isEmpty();
    }

    public static void main(String[] args){
        String string_exp = "([{}])";
        Balancing b = new Balancing();

        if (b.check_balance(string_exp)){
            System.out.println("Balanced");
        }else{
            System.out.println("UnBalanced");
        }
    }
}