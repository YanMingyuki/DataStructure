/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author User
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
  
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
  
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort.sort(arr, 0, arr.length-1);
        System.out.println("array:");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
    }
    
}
