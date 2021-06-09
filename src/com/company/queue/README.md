
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

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|

- After enqueuing `val = 35`
- `front = 0`
- `rear = 3`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack|12|13|22|35|
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
|Stack|12|13|22|

- After dequeuing
- `front = 1`
- `rear = 3`

|Index|0|1|2|3|4|
|---|---|---|---|---|---|
|Stack||13|22|
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
|Stack|||||
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
|Stack|12|13|22|35|45|
||:point_up_2:||||:point_up_2:|
||_front_||||_rear_|


# Cicular Queue 👌

|Q[7]|Q[0]|Q[1]|
|---|---|---|
|Q[6]||Q[2]|
|Q[5]|Q[4]|Q[3]|




