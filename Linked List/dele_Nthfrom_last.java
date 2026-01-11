public class dele_Nthfrom_last {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        // sizes-n(we need to reach
        Node prev = head;
        int i = 0;
        int idxToFind = size - n;
        while (i < idxToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");

        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        dele_Nthfrom_last dlt = new dele_Nthfrom_last();
        dlt.addFirst(10);
        dlt.addFirst(15);
        dlt.addFirst(30);
        dlt.addFirst(40);
        dlt.addFirst(50);
        dlt.print();
        dlt.deleteNthfromEnd(3);
        dlt.print();

    }
}