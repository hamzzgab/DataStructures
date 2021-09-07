# DataStructures :🗃️
 
Click on the links to redirect you to the `README.md` for insight into the DS

### 1. [Stack 🗄️ (LIFO)](https://github.com/flyingtatta/DataStructures/tree/main/DS_Java/src/com/company/stack#stack-%EF%B8%8F-lifo)
### 2. [Linear Queue 🧑‍🤝‍🧑 (FIFO)](https://github.com/flyingtatta/DataStructures/tree/main/DS_Java/src/com/company/queue#linear-queue--fifo)
### 3. [Circular Queue 👌 (FIFO)](https://github.com/flyingtatta/DataStructures/blob/main/DS_Java/src/com/company/queue/README.md#cicular-queue-)

# Stack 🗄️ (LIFO)
## Variables to be declared
- `MAX`  a variable to declare the final size of the stack
- `top` decalres the top most element in the stack (initialized to  _-1_)
- `stack` to store the values

## Functions
### 1. push(val)
```
if isFull()
    print Overflow
    
else 
    top++
    stack[top] = val
```

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|

- After pushing `val = 35`
- `top = 3`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|35|
|top||||:point_up_2:|

### 2. pop()
```
if isEmpty()
    print Underflow
    
else 
    popped_val = stack[top]
    top--		
```

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|

- After deleting
- `top = 1`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|
|top||:point_up_2:|

### 3. peek()
```
if isEmpty()
    print Underflow
    
else 
    return stack[top]
```

- `peek = 22`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|
|top|||:point_up_2:|

### 4. display()
```
if isEmpty()
    print Underflow
    
else 
    for i = 0; i<= top; i++
        print stack[i]
```

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|35|78|
|top|||||:point_up_2:|

### 5. isFull()
```
if top == MAX - 1
    return true
    
else 
    return false
```

- `MAX = 5`
- `top = 4`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|35|78|
|top|||||:point_up_2:|

### 6. isEmpty()
```
if top == -1
    return true
    
else 
    return false
```

- `top = -1`

|Index _-1_|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack||||||
|top :point_up_2:||||||
