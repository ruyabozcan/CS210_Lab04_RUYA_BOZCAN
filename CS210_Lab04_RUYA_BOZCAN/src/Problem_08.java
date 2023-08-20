public class Problem_08 {

    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
    public Node head = null;
    public Node tail = null;
    public void addNode(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public Node reverseList(Node temp)
    {
        Node current = temp;
        Node prevNode = null, nextNode = null;

        while(current != null)
        {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }
    public void isPalindrome()
    {
        Node current = head;
        boolean f = true;

        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        for(int i=1; i<mid; i++){
            current = current.next;
        }

        Node reverseHead = reverseList(current.next);

        while(head != null && reverseHead != null){
            if(head.data != reverseHead.data){
                f = false;
                break;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }

        if(f)
            System.out.println("Given singly linked list is a palindrome");
        else
            System.out.println("Given singly linked list is not a palindrome");
    }
    public void display()
    {
        Node current = head;

        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null)
        {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Problem_08 sList = new Problem_08();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(1);
        sList.display();
        sList.isPalindrome();
    }
}