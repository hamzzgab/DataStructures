package com.company.stack;

class Balancing{

    final int MAX = 10;
    int top = -1;
    char val = 0;
    char[] arr = new char[MAX];

    void push(char val) {
        if (isFull()){
            System.out.println("Overflow");
        }else {
            top = top + 1;
            arr[top] = val;
        }
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
        }else {
            val = arr[top];
            top = top - 1;
        }
        return val;
    }

    boolean isEmpty() {
        if (top == -1){
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top == MAX - 1){
            return true;
        }
        return false;
    }

    boolean check_balancing(String exp){
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                push(c);
            }

            if (isEmpty()){
                return false;
            }else {
                char check;
                switch (c){
                    case ')':
                        check = pop();
                        if (c == '}' || c == ']') {
                            return false;
                        }
                        break;
                    case '}':
                        check = pop();
                        if (c == ')' || c == ']') {
                            return false;
                        }
                        break;
                    case ']':
                        check = pop();
                        if (c == '}' || c == ')') {
                            return false;
                        }
                        break;
                }
            }
        }
        return (isEmpty());
    }

    public static void main(String[] args){
        String string_exp = "{([])}";
        Balancing b = new Balancing();

        if (b.check_balancing(string_exp)) {
            System.out.println("Balanced");
        }else {
            System.out.println("Unbalanced");
        }
    }
}