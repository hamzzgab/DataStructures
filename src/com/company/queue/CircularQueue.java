package com.company.queue;
import java.util.Scanner;

public class CircularQueue {

    int val;
    final int MAX = 5;
    int front = -1, rear = -1;
    int[] queue = new int[100];

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
                rear = (rear + 1) % MAX;
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
            if (front == rear){
                front = rear = -1;
            }
            else{
                front = (front + 1) % MAX;
            }
        }
        display();
    }

    void display(){
        int i=front;
        if (isEmpty()){
            print("Underflow");
        }else{
            System.out.print("\n");
            while (i != rear){
                System.out.println(queue[i]);
                i = (i + 1) % MAX;
            }
        }
    }

    boolean isEmpty(){
        if (front == -1 && rear == -1){
            return true;
        }else return false;
    }

    boolean isFull(){
        if ((rear + 1) % MAX == front){
            return true;
        }else return false;
    }

    public static void main(String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue();

        System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
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
