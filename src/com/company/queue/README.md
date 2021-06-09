
# Linear Queue 🧑‍🤝‍🧑 (FIFO)
## Variables to be declared
- `MAX`  a variable to declare the final size of the queue
- `front` decalres the starting element in the queue (initialized to  _-1_)
- `rear` declares the last element in the queue (initialized to  _-1_)
- `queue` to store the values

## Functions 🥳
### 1. enqueue(val)
```
if isFull()
 print Overflow
 
if front == -1 AND rear == -1
 front = rear = 0
else 
 rear++

queue[rear] = val
```
### 2. dequeue()
```
if isEmpty()
 print Underflow
else 
 popped_val = queue[front]
 front++
```
### 3. display()
```
if isEmpty()
 print Underflow
else
 for i = front; i <= rear; i++
  print(queue[i])  
```
### 4. isEmpty()
```
if front == -1 OR front > rear
 return true
else
 return false
```
### 5. isFull()
```
if rear == MAX - 1
 return true
else 
 return false
```

