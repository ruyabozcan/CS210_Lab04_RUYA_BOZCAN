public class Problem_09 {
    public static void main(String[] args) {
        CircularLinkedList L = new CircularLinkedList();
        CircularLinkedList M = new CircularLinkedList();

        L.insertAtStart(1);
        L.insertAtEnd(2);
        L.insertAtEnd(3);

        M.insertAtStart(4);
        M.insertAtEnd(5);
        M.insertAtEnd(6);

        // merge L and M into N
        CircularLinkedList N = new CircularLinkedList();
        N.head = L.head;
        L.tail.next = M.head;
        M.tail.next = L.head;
        N.tail = M.tail;

    }
    public class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public class CircularLinkedList
    {
        Node head;
        Node tail;

        public CircularLinkedList()
        {
            this.head = null;
            this.tail = null;
        }

        public boolean isEmpty()
        {
            return head == null;
        }

        public void insertAtEnd(int data)
        {
            Node newNode = new Node(data);

            if (isEmpty())

            {
                head = newNode;
                tail = newNode;
            }

            else

            {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }

            tail.next = head;
            head.prev = tail;
        }


        public void insertAtStart(int data)
        {
            Node newNode = new Node(data);

            if (isEmpty())
            {
                head = newNode;
                tail = newNode;
            }

            else
            {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            tail.next = head;
            head.prev = tail;
        }
}
