# DataStructures :🗃️
 
## Stack 🗄️ (LIFO)
### Variables to be declared
- `MAX`  a variable to declare the final size of the stack
- `top` decalres the top most element in the stack (initialized to  _-1_)
- `stack` to store the values

### Functions 🥳
1. push(val)
```
if isFull()
 print Overflow
else 
 top++
 stack[top] = val
```
2. pop()
```
if isEmpty()
 print Underflow
else 
 popped_val = stack[top]
 top--		
```
3. peek()
```
if isEmpty()
 print Underflow
else 
 return stack[top]
```
4. display()
```
if isEmpty()
 print Underflow
else 
 for i = 0; i<= top; i++
  print stack[i]
```
5. isFull()
```
if top == MAX - 1
 return true
else 
 return false
```
6. isEmpty()
```
if top == -1
 return true
else 
 return false
```

## Linear Queue 🧑‍🤝‍🧑 (FIFO)
### Variables to be declared
- `MAX`  a variable to declare the final size of the queue
- `front` decalres the starting element in the queue (initialized to  _-1_)
- `rear` declares the last element in the queue (initialized to  _-1_)
- `queue` to store the values

### Functions 🥳
1. enqueue(val)
```
if isFull()
 print Overflow
 
if front == -1 AND rear == -1
 front = rear = 0
else 
 rear++

queue[rear] = val
```
3. dequeue()
```
if isEmpty()
 print Underflow
else 
 popped_val = queue[front]
 front++
```
5. display()
```
if isEmpty()
 print Underflow
else
 for i = front; i <= rear; i++
  print(queue[i])  
```
7. isEmpty()
```
if front == -1 OR front > rear
 return true
else
 return false
```
9. isFull()
```
if rear == MAX - 1
 return true
else 
 return false
```

