public class LinkedList
{
    LinkedListNode head;

    public void deleteList(int value)
    {
        if (head != null && head.data == value)
        {
            head = head.next;
            return;
        }

        LinkedListNode current = head;
        LinkedListNode previous = null;
        while (current != null && current.data != value)
        {
            previous = current;
            current = current.next;
        }

        if (current == null)
        {
            System.out.println(value + " not found in the list.");
            return;
        }

        previous.next = current.next;
    }

    public void addToFront(int value)
    {
        LinkedListNode newNode = new LinkedListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void printList()
    {
        LinkedListNode current = head;
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToFront(5);
        list.addToFront(4);
        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);
        System.out.print("Original List: ");
        list.printList();
        list.deleteList(3);
        System.out.print("After deleting 3: ");
        list.printList();
        list.deleteList(1);
        System.out.print("After deleting 1: ");
        list.printList();
        list.deleteList(5);
        System.out.print("After deleting 5: ");
        list.printList();
        list.deleteList(10);
        System.out.print("After deleting 10: ");
        list.printList();
    }
}
