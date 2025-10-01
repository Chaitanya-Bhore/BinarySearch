import java.util.Scanner;


class BinarySearch {
    //Method for BubbleSort for sorting the array if array is not sorted.
    static void BubbleSort(int Array[]) {
        int temp;
        for(int i = 0; i<Array.length; i++) {
            for(int j = i+1; j<Array.length; j++) {
                if (Array[i] > Array[j]) {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
    }

    // Now as Array is sorted we can go for BinarySearch method

    static int BinarySearch( int A[], int left, int right, int key) {
        int mid;
        while(left <= right) {
            mid = (left + right)/2;

            // if key is found at mid
            if (A[mid] == key) {
                return mid;
            }
            // if key is smaller, search in left half
            else if (A[mid] > key) {
                right = mid-1;
            }
            // if key is bigger than mid search in right half
            else {
                left = mid+1;
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int Array[] = new int[6];
        Scanner sc = new Scanner(System.in);

        // input elements
        System.out.println("Enter Array Elements: ");
        for(int k=0; k<Array.length; k++) {
            Array[k] = sc.nextInt();
        }

        // Display Array Before Sorting
        System.out.println("Array Before Sorting: ");
        for(int k=0; k<Array.length; k++) {
            System.out.println(Array[k] + "\t");
        }
        System.out.println();

        // Sort Array using bubbleSort

        BubbleSort(Array);

        // Display array after Sorting
        System.out.println("Array after sorting: ");
        for(int k=0; k<Array.length; k++) {
            System.out.println(Array[k] + "\t");
        }
        System.out.println();

        //Ask for element to Search
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        // Performing Binary Search 

        int result = BinarySearch(Array, 0, Array.length-1, key);

        //Display Result

        if(result == -1) {
            System.out.println("Element is not found. ");

        } else {
            System.out.println("Element is found at index" + " " + result);
        }

        sc.close();
    }
}