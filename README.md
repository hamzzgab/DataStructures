# DataStructures :🗃️
 
## Stack 🗄️ (LIFO)
### Variables to be declared
- `MAX`  a variable to declare the final size of the stack
- `top` decalres the top most element in the stack (initialized to  _-1_)
- `stack` to store the values

### Functions
1. isFull()
```
if top == MAX - 1
 return true
else 
 return false
```
2. isEmpty()
```
if top == -1
 return true
else 
 return false
```
3. push()
```
if isFull()
 print Overflow
else 
 top++
 stack[top] = val
```
4. pop()
```
if isEmpty()
 print Underflow
else 
 popped_val = stack[top]
 top--		
```
5. peek()
```
if isEmpty()
 print Underflow
else 
 return stack[top]
```
6. display()
```
if isEmpty()
 print Underflow
else 
 for i = 0; i<= top; i++
  print stack[i]
```

## Linear Queue 🧑‍🤝‍🧑 (FIFO)
### Variables to be declared
- `MAX`  a variable to declare the final size of the queue
- `front` decalres the starting element in the queue (initialized to  _-1_)
- `rear` declares the last element in the queue (initialized to  _-1_)
- `queue` to store the values
