public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    static int size;

    // add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
         tail.next  = newNode;
         newNode.prev = tail;
         tail = newNode;

    }

    // removeFirst
    public void removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return ;
        }
            if(size==1){
                
                head = tail = null;
                size--; 
            }
            head = head.next;
            head.prev = null;
            size--;

    }

    // removeLast
        public void removeLast(){
            if(head==null){
                System.out.println("DLL is empty");
                return;
            }
            if(size==1){
                head = tail = null;
                size = 0;
                return;
            }
            tail = tail.prev;
            tail.next = null;
            size--;
        }


    public void print(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        // dll.addFirst(3);
        // dll.addFirst(2);
        // dll.addFirst(1);
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);
        dll.addLast(50);
        dll.print();
        System.out.println(dll.size);
        
        dll.print();
        dll.reverse();
        dll.print();
        // dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);
        
        
    }
    
}
