public class Problem_07
{
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        printReverse(head);
    }

    public static void printReverse(Node head) {
        if (head == null)
        {
            return;
        }

        printReverse(head.next);
        System.out.print(head.data + " ");
    }
}
