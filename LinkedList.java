class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }

        public static void main(String[] args) {
            LinkedList lst = new LinkedList();
            head = new Node(10);
            Node Second = new Node(20);
            Node Third = new Node(30);
            Node Fourth = new Node(40);

        
    }
}