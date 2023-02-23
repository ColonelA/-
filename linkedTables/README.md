### 题解  
首先判断当前链表头节点是否为空，为空则默认返回null   
声明next 节点
声明 pre 节点
 
在 while 执行到最后的一个节点的next 指针为空时视作结束条件

之后开始反转逻辑 
1. 首先要获得当前节点的下一个节点
```java
    next = head.next; 
``` 
2. 反转以及存储过的head.next的指向
```java
    head.next = pre; 
``` 
3.  将链表更新到下一个状态
```java
    pre = head;
    head = next;
``` 
 

