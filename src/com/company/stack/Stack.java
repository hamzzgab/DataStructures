package com.company.stack;

import java.util.Scanner;

class Stack {
    final int MAX = 50;
    int top = -1;
    char[] arr = new char[MAX];

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

    char pop(){
        char val = 0;
        if (isEmpty()){
            print("Underflow");
        }else {
            val = arr[top];
            top = top - 1;
        }
        return val;
    }

    void peek(){
        if (isEmpty()){
            print("Underflow");
        } else System.out.println("["+top+"] - "+arr[top]);
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

    void display(){
        if (isEmpty()){
            print("Underflow");
        }else{
            System.out.println("\n");
            for (int i=0; i<=top; i++){
                System.out.println("[" + i + "] - " + arr[i]);
            }
        }
    }

    public static void main(String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        while(choice != 5){
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    char val;
                    System.out.println("Enter char to be pushed");
                    val = sc.next().charAt(0);
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    s.print("Bye...");
                default:
                    s.print("Enter from the choices only");
                    break;
            }
        }
    }
}