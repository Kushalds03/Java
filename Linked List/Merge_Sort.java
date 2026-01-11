public class Merge_Sort {
    public static class Node{
         int  data;
         Node next;
         public Node(int data){
            this.data = data;
            this.next = null;
         }
    }
      public static Node head;
      public static Node tail;

      public void addFirst(int data){
        Node newNode = new Node(data);
    
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    
    public Node merge_Sort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left  and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = merge_Sort(head);
        Node newRight = merge_Sort(rightHead);

        // merge
        return merge(newLeft,newRight);
    }
      private Node  getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
      }

      public void print(){
        if(head== null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

      private Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 !=null && head2 !=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
            while(head1!= null){
                temp.next =  head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2!=null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergedLL.next;

      }

      public void zigZag(){
        // find the mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid =slow;


        // reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;
    
        // Alternate merge;
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
      }

    public static void main(String[] args) {
        Merge_Sort ms = new Merge_Sort();
        ms.addFirst(6);
        ms.addFirst(5);
        ms.addFirst(4);
        ms.addFirst(3);
        ms.addFirst(2);
        ms.addFirst(1);
        ms.addFirst(1);

        ms.print();
        ms.zigZag();
        ms.print();

        ms.head = ms.merge_Sort(ms.head);
        ms.print();

        ms.zigZag(); // gives the zigzag one 
        ms.print();
        
    }
    
}
