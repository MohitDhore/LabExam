class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static void insertion_at_end(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new Node(data);
        }

        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
            last.next = new_node;
            return;

        }
    }

    static void display() {

    }

    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        head = new Node(10);
        Node Second = new Node(20);
        Node Third = new Node(30);
        Node Fourth = new Node(40);

    }
}