
package bubbleshortexample;
/**
 *
 * @author Bahrulapk
 */
public class SelectionSort {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Langkah 1: Temukan elemen minimum pada sisa array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
}}
            int temp = arr[minIndex]; // Langkah 2: Tukar elemen minimum dengan elemen pertama/sesuai iterasi
            arr[minIndex] = arr[i];
            arr[i] = temp;
}}
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Array Before Selection Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        selectionSort(arr); // Panggil metode untuk mengurutkan array menggunakan Selection Sort
        System.out.println("Array After Selection Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }}}
