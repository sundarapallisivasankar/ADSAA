import java.util.*;

class binarySearch {

    public static void bin(int[] arr, int key) {
        int low = 0, high = arr.length - 1; 
        while (low <= high) {
            int mid = (low + high) / 2; 
            if (arr[mid] == key) {
                System.out.println("Key found at index: " + mid);
                return;
            }
            if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Key not found in the array.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("Array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the key value:");
        int key = sc.nextInt();
        bin(arr, key);
    }
}

