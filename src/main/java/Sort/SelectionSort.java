package Sort;

import java.util.ArrayList;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        int minIndex;
        for(int i=0; i<arr.length-1; i++) {
            minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] >= arr[minIndex]) continue;
                minIndex = j;
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}
