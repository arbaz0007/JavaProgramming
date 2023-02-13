class Node{
    int data;
    Node next ;
    Node(int x){
        data = x;
        next = null;
    }

static void printLinkedList(Node head){
    Node n = head;
    while(n != null){
        System.out.println(n.data + " ");
        n = n.next;
    }
}

public class Traversing {
    public static void main(String[] args) {
        Node n1 = new Node(100);
        n1.next = new Node(200);
        n1.next.next = new Node(300);
        n1.next.next.next = new Node(400);
        printLinkedList(n1);
    }
    }
}