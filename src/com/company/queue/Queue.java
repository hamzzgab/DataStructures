package com.company.queue;
import java.util.Scanner;

public class Queue {

    int val;
    final int MAX = 5;
    int front = -1, rear = -1;
    int[] queue = new int[MAX];

    void print(String str){
        System.out.println(str);
    }

    void enqueue(int val){
        if (isFull()){
            print("Overflow");
        }
        if (front == -1 && rear == -1) {
            front = rear = 0;
        }
        else{
            rear++;
        }
        queue[rear] = val;
    }

    int dequeue(){
        if (isEmpty()){
            print("Underflow");
        }else{
            val = queue[front];
            front++;
        }
        return val;
    }

    void display(){
        if (isEmpty()){
            print("Underflow");
        }else{
            System.out.println("\n");
            for (int i=front; i <= rear; i++){
                System.out.println("[" + i + "] - " + queue[i]);
            }
        }
    }

    boolean isEmpty(){
        if (front == -1 || front > rear){
            return true;
        }else return false;
    }

    boolean isFull(){
        if (rear == MAX - 1){
            return true;
        }else return false;
    }

    public static void main(String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
        while(choice != 4){
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    int val;
                    System.out.println("Enter value to be queued: ");
                    val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.print("Bye...");
                default:
                    q.print("Enter from the choices only");
                    break;
            }
        }
    }
}
