package Sort;

import java.util.ArrayList;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] <= arr[j+1]) continue;
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
