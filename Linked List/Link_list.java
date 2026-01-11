

public class Link_list{
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
    public static int size;

    public void addFirst(int data){
        
        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = tail = newNode;
            return;
        }
        // Step 2: Assigning the newNode next = head
        newNode.next = head; //linking step

        // Step 3 : head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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
    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        int i = 0;
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        while (i<idx-1) { 
            temp = temp.next;
            i++;    
        }
        // i = idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
      
    }
    public int remove_First(){
        if(size==0){
            System.out.println("Linklist is empty");
            return Integer.MAX_VALUE;//(anything we can return )
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int remove_Last(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;

        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        // prev: i = size-2 (size -1 is the last one)
        Node prev = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    

    //  For iterative search
    public int iteSearch(int key){
        int i=0;
        Node temp = head;
        while(temp !=null){
            if(temp.data == key){
                return i;

            }
            temp = temp.next;
            i++;
        }
        // Key not found case 
        return -1;
    }

    public static void main(String args[]){
        Link_list link = new Link_list();
        link.print();
        
        link.addFirst(2 );
        link.addFirst(1);
        link.addLast(3);
        
        link.addLast(4);
        
        link.add(2,9);
        link.print();
        System.out.println(link.size);

        link.remove_First();
        link.print();

        link.remove_Last();
        link.print();

        System.out.println(link.iteSearch(3));
        System.out.println(link.iteSearch(10));
    }
}
