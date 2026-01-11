public class Palindrome {
     public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

     public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");

        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
   // slow-fast approach (step 1)    
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){  // fast != null(its a even case) fast.next!=null(odd case)
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;   // slow is the mid node 
    }
 
    
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step 1- find mid 
        Node midNode = findMid(head);


        // step 2 - reverse 2nd half;
        Node prev = null;
        Node curr = midNode;
        Node next; 
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // step 3 - check lwft half and right half 
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome pl = new Palindrome();
        pl.addFirst(1);
        pl.addFirst(2);
        pl.addFirst(3);
        pl.addFirst(1);
        pl.print();
        System.out.println(pl.checkPalindrome());
    }
    
    
}
