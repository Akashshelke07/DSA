package Linkedlist.Deletion;

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

public class DeleteHead {
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

    private static void print(Node head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    //delete head form the linkedlist
    private static Node removesHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {5, 12 , 15, 20};
        Node head = convertArray2Linklist(arr);
        head = removesHead(head);
        print(head);
    }
}
        
