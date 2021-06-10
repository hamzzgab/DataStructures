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
||:point_up_2:|||:point_up_2:|
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
|||:point_up_2:|:point_up_2:|
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
||:point_up_2:||||:point_up_2:|
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
|:point_up_2:|
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
||:point_up_2:||||:point_up_2:|
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
 ||:point_up: ||:point_left: ||
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
 ||:point_up:|50|:point_left: ||
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
 ||:point_up: ||:point_left: ||
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
 ||:point_up: ||:point_left: ||
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
 ||:point_up:|50|:point_left: ||
 | ||Q[4] | ||

- `rear = 0`
- `front = 0`

 | ||Q[0] | ||
|---|---|---|---|---|
 ||:point_right:|10|:point_down: ||
|Q[7] ||||Q[1]|
|Q[6] ||||Q[2]|
|Q[5] ||||Q[3]|
 ||:point_up: ||:point_left: ||
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
 ||:point_up: ||:point_left: ||
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
||:point_up:||:point_left:||
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
||:point_up:|50|:point_left:||
|||Q[4]|||