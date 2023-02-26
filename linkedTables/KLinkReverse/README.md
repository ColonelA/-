###  链表题解 K个数量中完成对链表的逆序  

/* 
    给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。

    k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。

     你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 
*/  


#### 解题思路以及注意点  

 1. 首先要确定，每次的翻转的链表start 到 该次end的距离，确定满足k个时才去做真正的翻转操作，否则直接略过，直接返回已经翻转的head节点，或者不足k个时，直接返回该（不处理）链表的头部
 2. 在处理第一次反转的链表后（足够K个的情况下），将head的指向指向翻转end值作为记录。
   

#### 具体代码解析 


 ```java   

    class KLinkReverse { 
          
     // 定义类
    public static class ListNode {
        public int val;
        public ListNode next;
    } 

  
   // 计算当前链表是否能够满足排列K个需求
   public static ListNode getKGroupEnd(ListNode start, int k ){   
     
        /* 
         * --k 是为了迭代k个的数量，!= 0 是在判断是否带临界值;
         *  
         *  然后执行 在符合start != null 情况下迭代start的指向;
         *  假设start在while 中有一处为null则直接返回当前null;
         * 
         *  函数结束
        */
       while (--k != 0 && start != null ){ 
            start = start.next;
      } 
        
      return start;
   }   


    // 独立翻转已经计算好的节点
    public static void reverse(ListNode start, ListNode end ){   
         /*
         *  首先记录当前结束位置的节点，为翻转后的新列表做next指向准备
         *   1-> 3 -> 4 ---> 5  5在k为3的情况下为end的next 
         *   1 <- 3 <- 4 ----> 5 
         *  最后 5 <- 1 <- 3 <- 4  
         */
         end = end.next; 
         ListNode pre = null;  
         ListNode cur = start;
         ListNode next = null;
        while (cur != end) { 
             next = cur.next; 
             cur.next = pre; 
             pre = cur;  
             cur = next;
        }
        start.next = end;
    }
    
      public static ListNode reverseKGroup(ListNode head, int k){   
        ListNode start = head; 

        // 首次查看是否足够k个
        ListNode end = getKGroupEnd(start, k);

        // 不够时直接返回
        if (end == null){ 
            return head;
        }
          
        head = end;
        reverse(start,end);   
         // 获得第一次翻转的后的新 开始节点 start.next 就是reverse函数中记录下的 end.next
        ListNode lastEnd = start; 
          
        
        while (lastEnd.next != null) {  
              // 获取 end.next 即当前业务实要翻转的下一个节点
              start = lastEnd.next; 
              end = getKGroupEnd(start, k);
              if (end == null) {
                  return head;
              }  
  
              reverse(start, end); 
                
              // 修改已经翻转后的  修改前 lastEnd.next = start    
              lastEnd.next = end;  
              // 跳转到本次计算后的start 修改前还在上一组的start位置
              lastEnd = start;
              
        } 
        return head;
    }
  
 
   
     



          
    }

```