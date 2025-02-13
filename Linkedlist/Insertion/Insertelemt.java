package Linkedlist.Insertion;
  
/* problem on inseting the element in the linkedlist */
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

public class Insertelemt {
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

    private static Node Insertelement(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 12, 15, 20 };
        Node head = convertArray2Linklist(arr);
        head = Insertelement(head, 55);
        print(head);
    }
}
