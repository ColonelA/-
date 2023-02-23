### 单链表反转题解  
首先判断当前链表头节点是否为空，为空则默认返回null   
声明next 节点
声明 pre 节点
 
在 while 执行到最后的一个节点的next 指针为空时视作结束条件
 
```java
    public static Node main(Node head){ 
      
    Node pre = null;
    Node next = null;
    
    while (head != null) {
        next = head.next;
        head.next = pre; 
        pre = head;
        head = next;
     }
    
    return pre;
}
```



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


### 双链表题解
 
```java
  public static DoubleNode main(DoubleNode head) { 
        
       DoubleNode pre = null; 
       DoubleNode next =null;
          
       while (head != null){ 
           next = head.next;
           head.next = pre; 
           head.last = next;  
           pre = head;
           head = next;
       }
 
      return pre;
    }
```

1.  使用while遍历整个链表, 同当head访问到最后一个节点时为结束条件  
2.  直接要将 next 反转后指向上一个点节点
3.  要将last反转后指向下一个节点
