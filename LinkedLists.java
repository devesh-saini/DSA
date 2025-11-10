class LinkedLists {
    static Node head = new Node(5);

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(10);
        addNode(5);

        printList();

    }

    static void isPalindrome() {
        Node mid = findMid();

        Node head1 = head;
        Node head2 = reversePartList(mid);

        while (head1 != mid || head2 != mid) {
            if (head1.data != head2.data) {
                System.out.println("Not a palindrome.");
                return ;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        System.out.println("A palindrome.");
    }

    static Node findMid() {
        Node hare = head;
        Node turtle = head;
        while (hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        
        return turtle;
    }

    static Node reversePartList(Node curr) {
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void addNode(int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    static void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static Node reverseRecursive(Node head) {
        if (head == null || head.next == null)
            return head;

        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}
 
