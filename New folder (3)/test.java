class Node {
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }

    class test{
        public static void main(String[] args) {
        Node n= new Node(10);
        n.next=new Node(20);
        n.next.next =new Node(30);
        n.next.next.next=new Node(40);

        printlist(n);
        }
    }
        public static void printlist(Node n){
        Node curr =n;
        while(curr != null){
        System.out.println(curr.data);
        curr=curr.next;
        }
    }
    }