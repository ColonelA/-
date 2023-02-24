package linkedTables;

public class SingleReverseLinkList {
     

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }
        
  // https://leetcode.cn/problems/UHnkqh/
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





}
