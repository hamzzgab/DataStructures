package com.company.queue;
import java.util.Scanner;

public class CircularQueue {

    int val;
    final int MAX = 5;
    int front = -1, rear = -1;
    int[] queue = new int[MAX];

    CircularQueue(){
        front = -1;
        rear = -1;
    }

    void print(String str){
        System.out.println(str);
    }

    void enqueue(int val){
        if (isFull()){
            print("Overflow");
        }else{
            if (isEmpty()) {
                front = rear = 0;
            }else if (rear == MAX - 1 && front != 0){
                rear = 0;
            }
            else {
                rear = (rear + 1);
            }
            queue[rear] = val;
        }
        display();
    }

    void dequeue(){
        if (isEmpty()){
            print("Underflow");
        }else {
            val = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else if (front == MAX - 1) {
                front = 0;
            }
            else{
                front = (front + 1);
            }
        }
        display();
    }

    void display(){
        if (isEmpty()){
            print("Underflow");
        }else{
            if (rear >= front){
                for (int i=front; i <= rear; i++){
                    System.out.println("[" + i + "] - " + queue[i]);
                }
            }else{
                for (int i = front; i < MAX; i++){
                    System.out.println("[" + i + "] - " + queue[i]);
                }
                for (int i = 0; i <= rear; i++){
                    System.out.println("[" + i + "] - " + queue[i]);
                }
            }
        }
    }

    boolean isEmpty(){
        if (front == -1 && rear == -1){
            return true;
        }else return false;
    }

    boolean isFull(){
        if ((front == 0 && rear == MAX -1) ||
                (rear == (front - 1) % (MAX - 1))) {
            return true;
        }else return false;
    }

    public static void main(String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue();

        System.out.print("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit\n");
        while(choice != 4){
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    int val;
                    System.out.print("Enter value to be queued: ");
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