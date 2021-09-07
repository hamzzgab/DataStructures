# DataStructures :🗃️

Click on the links to redirect you to the `README.md` for insight into the DS

### 1. [Stack 🗄️ (LIFO)](https://github.com/flyingtatta/DataStructures/blob/main/README.md#stack-%EF%B8%8F-lifo)
### 2. [Linear Queue 🧑‍🤝‍🧑 (FIFO)](https://github.com/flyingtatta/DataStructures/blob/main/README.md#linear-queue--fifo)
### 3. [Circular Queue 👌 (FIFO)](https://github.com/flyingtatta/DataStructures/blob/main/README.md#cicular-queue-)

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
|top||||☝️|

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
|top||☝️|

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
|top|||☝️|

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
|top|||||☝️|

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
|top|||||☝️|

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
|top ☝️||||||

# Linear Queue 🧑‍🤝‍🧑 (FIFO)
## Variables to be declared
- `MAX`  a variable to declare the final size of the queue
- `front` decalres the starting element in the queue (initialized to  _-1_)
- `rear` declares the last element in the queue (initialized to  _-1_)
- `queue` to store the values

## Functions
### 1. enqueue(val)
```
if isFull()
    print Overflow

else  
    if front == -1 AND rear == -1
        front = rear = 0

    else
        rear++

    queue[rear] = val
```

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Queue|12|13|22|

- After enqueuing `val = 35`
- `front = 0`
- `rear = 3`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Queue|12|13|22|35|
||☝️|||☝️|
||_front_|||_rear_|

### 2. dequeue()
```
if isEmpty()
    print Underflow

else
    popped_val = queue[front]
    front++
```

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Queue|12|13|22|

- After de-queuing
- `front = 1`
- `rear = 3`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Queue||13|22|
|||☝️|☝️|
|||_front_|_rear_|


### 3. display()
```
if isEmpty()
    print Underflow

else
    for i = front; i <= rear; i++
        print(queue[i])  
```

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|35|45|
||☝️||||☝️|
||_front_||||_rear_|


### 4. isEmpty()
```
if front == -1 OR front > rear
    return true

else
    return false
```

- `front == -1`

|Index _-1_|0|1|2|3|4|
|---|---|---|---|---|---|
|Queue|||||
|☝️|
|_front_|


### 5. isFull()
```
if rear == MAX - 1
    return true

else
    return false
```

- `MAX = 5`
- `rear = 4`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Queue|12|13|22|35|45|
||☝️||||☝️|
||_front_||||_rear_|


# Cicular Queue 👌
|Q[7]|Q[0]|Q[1]|
|---|---|---|
|Q[6]||Q[2]|
|Q[5]|Q[4]|Q[3]|

## Variables
- `MAX`  a variable to declare the final size of the queue
- `front` declares the starting element in the queue (initialized to  _-1_)
- `rear` declares the last element in the queue (initialized to  _-1_)
- `queue` to store the values

## Functions
### 1. enqueue(val)

```
if isFull()
    print("Overflow");

else
    if isEmpty()
        front = rear = 0;

    else if rear == MAX - 1 && front != 0
        rear = 0;

    else
        rear = (rear + 1);

    queue[rear] = val;
```


- `front = 0`
- `rear = 3`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right:|10|:point_down: ||
|Q[7] | ||20|Q[1]|
|Q[6] | ||30|Q[2]|
|Q[5] | ||40|Q[3]|
 ||☝️ ||:point_left: ||
 | ||Q[4] | ||

- After enqueuing `val = 50`
- `front = 0`
- `rear = 4`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right:|10|:point_down: ||
|Q[7] | ||20|Q[1]|
|Q[6] | ||30|Q[2]|
|Q[5] | ||40|Q[3]|
 ||☝️|50|:point_left: ||
 | ||Q[4] | ||


### 2. dequeue()

```
if isEmpty()
    print("Underflow");

else
    val = queue[front];

    if front == rear
        front = rear = -1;

    else if (front == MAX - 1)
        front = 0;

    else
        front = (front + 1);
```

- `front = 0`
- `rear = 3`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right:|10|:point_down: ||
|Q[7] | ||20|Q[1]|
|Q[6] | ||30|Q[2]|
|Q[5] | ||40|Q[3]|
 ||☝️ ||:point_left: ||
 | ||Q[4] | ||

- After de-queuing
- `front = 1`
- `rear = 3`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right: ||:point_down: ||
|Q[7] | ||20|Q[1]|
|Q[6] | ||30|Q[2]|
|Q[5] | ||40|Q[3]|
 ||☝️ ||:point_left: ||
 | ||Q[4] | ||

### 3. display()

```
if (isEmpty()){
    print("Underflow");

else
    if rear >= front
        for int i=front; i <= rear; i++
            print queue[i]

    else
        for int i = front; i < MAX; i++
            print queue[i]      

        for int i = 0; i <= rear; i++
            print queue[i]
```

1. `rear >= front`

- `rear = 7`
- `front = 0`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right:|10|:point_down: ||
|Q[7]|80 ||20|Q[1]|
|Q[6]|70 ||30|Q[2]|
|Q[5]|60 ||40|Q[3]|
 ||☝️|50|:point_left: ||
 | ||Q[4] | ||

- `rear = 0`
- `front = 0`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right:|10|:point_down: ||
|Q[7] ||||Q[1]|
|Q[6] ||||Q[2]|
|Q[5] ||||Q[3]|
 ||☝️ ||:point_left: ||
 | ||Q[4] | ||

2. `else`

- `MAX = 8`
- `front = 6`
- `rear = 2`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right:|10|:point_down: ||
|Q[7]|15 ||20|Q[1]|
|Q[6]|25 ||30|Q[2]|
|Q[5] ||- ||Q[3]|
 ||☝️ ||:point_left: ||
 | ||Q[4] | ||



### 4. isEmpty()

```
if front == -1 && rear == -1
    return true;

else
    return false;
```

|||Q[0]|||
|---|---|---|---|---|
||:point_right:||:point_down:||
|Q[7]||||Q[1]|
|Q[6]||||Q[2]|
|Q[5]||||Q[3]|
||☝️||:point_left:||
|||Q[4]|||

### 5. isFull()

```
if (front == 0 && rear == MAX -1) ||
   (rear == (front - 1) % (MAX - 1))
    return true;    
else
    return false;
```

|||Q[0]|||
|---|---|---|---|---|
||:point_right:|10|:point_down:||
|Q[7]|80||20|Q[1]|
|Q[6]|70||30|Q[2]|
|Q[5]|60||40|Q[3]|
||☝️|50|:point_left:||
|||Q[4]|||
