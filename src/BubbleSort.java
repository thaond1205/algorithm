import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    //thuat toan bubble sort 

    void bubbleSort(int[] arr){
        //{2,5,3,6,8,1};
        int temp;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,8,1,3,5,8,9,2,4,5,6,7};
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);
        System.out.println("Sorted array"); 
        sort.printArray(arr);
       
    }
}
