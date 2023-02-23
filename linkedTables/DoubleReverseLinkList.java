class DoubleReverseLinkList { 
       

    public static class DoubleNode {
		public int value;
		public DoubleNode last;
		public DoubleNode next;

		public DoubleNode(int data) {
			value = data;
		}
	}


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

     

}