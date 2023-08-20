public class Problem_05 {
    public static void main(String[] args) {
        // Create a sorted linked list with some nodes
        LinkedList list = new LinkedList();
        list.SortedInsert(1);
        list.SortedInsert(3);
        list.SortedInsert(5);
        list.SortedInsert(7);

        System.out.print("Original List: ");
        list.printList();

        list.SortedInsert(4);

        System.out.print("Updated List: ");
        list.printList();
    }
    public void SortedInsert(int value) {
        ListN node = new ListN(value);
        if (head == null || value <= head.val) {  // insert at beginning
            node.next = head;
            head = node;
        }
        else
        {
            ListN current = head;
            while (current.next != null && value > current.next.val)
            {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }


}

