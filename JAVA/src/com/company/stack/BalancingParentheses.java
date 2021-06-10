package com.company.stack;

class BalancingParentheses extends Stack{

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
        String string_exp = "[]";
        BalancingParentheses b = new BalancingParentheses();

        if (b.check_balancing(string_exp)) {
            System.out.println("Balanced");
        }else {
            System.out.println("Unbalanced");
        }
    }
}