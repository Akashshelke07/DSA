public class arra {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 58, 75 }; // Fixed missing semicolon
        swap(arr, 1, 2); // Corrected method call
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
