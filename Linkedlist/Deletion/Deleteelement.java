package Linkedlist.Deletion;
/* In this problem we delete the element form the given linkedlist */

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null; // last index
    };
}

public class Deleteelement {
    private static Node convertArray2Linklist(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node deleteelement(Node head, int element) {
        if (head == null)
            return head;
        if (head.data == element) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == element) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 12, 15, 20 };
        Node head = convertArray2Linklist(arr);
        head = deleteelement(head, 15);
        print(head);
    }
}
