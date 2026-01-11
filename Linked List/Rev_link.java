public class Rev_link {
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
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode; 
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

    public void reverse(){
        Node prev = null;
        Node curr = head ;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Rev_link link = new Rev_link();
        link.addFirst(10);
        link.addFirst(20);
        link.addFirst(50);
        link.addLast(60);
        link.addLast(70);
        link.print();
        link.reverse();
        link.print();
    }
}
