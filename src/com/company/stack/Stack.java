package com.company.stack;

import java.util.Scanner;

class Stack {
    final int MAX = 5;
    int top = -1;
    int[] arr = new int[MAX];

    void print(String str){
        System.out.println(str);
    }

    void push(int val){
        if (isFull()){
            print("Overflow");
        }else {
            top = top + 1;
            arr[top] = val;
        }
    }

    void pop(){
        if (isEmpty()){
            print("Underflow");
        }else {
            top = top - 1;
            display();
        }
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
            for (int i=0; i<=top; i++){
                System.out.println("\n[" + i + "] - " + arr[i]);
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
                    int val = 0;
                    System.out.println("Enter integer to be pushed");
                    val = sc.nextInt();
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
                default:
                    s.print("Enter from the choices only");
                    break;
            }
        }
    }
}