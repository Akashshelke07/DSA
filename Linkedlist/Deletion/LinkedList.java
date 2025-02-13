package Linkedlist.Deletion;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null; //last index
    }
};
public class LinkedList{

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9};
        Node y = new Node(arr[3], null);
        System.out.println(y); {/*this tell us the memory of the array */}{/* y.data--> tell us the array index */}
    }

}
