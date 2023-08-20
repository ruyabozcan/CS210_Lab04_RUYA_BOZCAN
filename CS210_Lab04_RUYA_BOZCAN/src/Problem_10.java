public class Problem_10
{
    private static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public Problem_10()
    {
        this.head = null;
    }

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            head.next = head;
        }
        else
        {
            Node now = head;
            while (now.next != head)
            {
                now = now.next;
            }
            now.next = newNode;
            newNode.next = head;
        }
    }

    public void splitCircularList()
    {
        if (head == null || head.next == head)
        {
            return;
        }

        Node slow = head;
        Node fast = head.next;
        while (fast.next != head && fast.next.next != head)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middle = slow.next;

        slow.next = head;
        Node tail1 = slow;

        Node head2 = middle;
        Node tail2 = null;
        if (fast.next == head)
        {
            tail2 = fast;
        }
        else
        {
            tail2 = fast.next;
        }
        tail2.next = head2;

        System.out.print("Circular List 1: ");
        printCircularList(head, tail1);
        System.out.print("Circular List 2: ");
        printCircularList(head2, tail2);
    }
    private void printCircularList(Node head, Node tail)
    {
        Node now = head;
        while (now != tail)
        {
            System.out.print(now.data + " ");
            now = now.next;
        }
        System.out.println(tail.data);
    }
    public static void main(String[] args)
    {
        Problem_10 cll = new Problem_10();
        cll.addNode(1);
        cll.addNode(2);
        cll.addNode(3);
        cll.addNode(4);
        cll.addNode(5);
        cll.addNode(6);
        cll.splitCircularList();
    }
}
