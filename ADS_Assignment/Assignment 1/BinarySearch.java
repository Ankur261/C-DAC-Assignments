import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;
        int index = binarySearch(arr, key);
		
        System.out.println("Key found at index: " + index);

        // First and Last Occurrence
        int firstOccurrence = findFirstOccurrence(arr, key);
        int lastOccurrence = findLastOccurrence(arr, key);
        System.out.println("First occurrence: " + firstOccurrence);
        System.out.println("Last occurrence: " + lastOccurrence);

        // Total count of the key
        int totalCount = (firstOccurrence == -1) ? 0 : (lastOccurrence - firstOccurrence + 1);
        System.out.println("Total count of key: " + totalCount);

        // Input for Peak Element
        int[] peakArr = {1, 2, 18, 4, 5, 0};
        int peakElement = findPeakElement(peakArr);
        System.out.println("Peak element: " + peakElement);
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Key not found
    }

    // Find First Occurrence
    public static int findFirstOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1; // Search in the left half
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Find Last Occurrence
    public static int findLastOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                low = mid + 1; // Search in the right half
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Find Peak Element
    public static int findPeakElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] > arr[i - 1]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) {
                return arr[i];
            }
        }
        return -1; // No peak element (for edge cases)
    }
}