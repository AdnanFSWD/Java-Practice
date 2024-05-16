public class ArrayReverse {
    public class reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move towards the center of the array
            start++;
            end--;
        }
    }
}