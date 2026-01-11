public class Link{
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
    public void addLast(int data){
        Node newNode  = new Node(data);
          size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    

    public int helper(Node head,int key){  //O(n)
        if(head == null){
            return -1;

        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public static void main(String[] args){
        Link link = new Link();
        link.addFirst(10);
        link.addFirst(20);
        link.addFirst(30);
        link.addFirst(40);
        System.out.println(link.recSearch(10));
        System.out.println(link.recSearch(600));

    }
}
