public class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        int n = arr.length;

        // bubble sort O(n^2)
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // // swap
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // Selection sort O(n^2)
        // for (int i = 0; i < n; i++) {
        // int smallIndex = i;
        // for (int j = i + 1; j < n; j++) {
        // if (arr[j] < arr[smallIndex]) {
        // smallIndex = j;
        // }
        // }
        // // swap arr[i] and arr[j]
        // int temp = arr[i];
        // arr[i] = arr[smallIndex];
        // arr[smallIndex] = temp;
        // }

        // Insertion Sort O(n^2)
        // for (int i = 1; i < n; i++) {
        // int current = arr[i];
        // int j = i - 1;
        // while (j >= 0 && arr[j] > current) {
        // arr[j + 1] = arr[j];
        // j--;
        // }
        // // placement
        // arr[j + 1] = current;
        // }

        printArray(arr);
    }
}
