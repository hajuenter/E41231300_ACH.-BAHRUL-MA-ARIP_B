
package bubbleshortexample;
/**
 *
 * @author Bahrulapk
 */
public class BubbleShortExample {
static void bubbleshort(int[] arr) {
int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j]; // Program pertukaran elemen
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    temp = arr[j-1]; arr[j-1] = arr[j]; arr[j] = temp;
}}}}
    public static void main(String[] args) {
    int arr[]={3,60,35,2,45,320,5};
        System.out.println("Array Before Bubble Sort");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println("");
            bubbleshort(arr);
            System.out.println("Array After Bubble Sort");
            for(int i=0; i < arr.length; i++ ) {
                System.out.print(arr[i] +" ");
}}}
