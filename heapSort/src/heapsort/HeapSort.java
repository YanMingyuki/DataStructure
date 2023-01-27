/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

/**
 *
 * @author User
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        HeapSort.sort(arr);
    
        System.out.println();
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
    }
    
}
