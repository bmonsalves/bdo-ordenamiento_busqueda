import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {

        int all= 1000;
    		
    	int[] list = new int[all];
    	Random rand = new Random();
      	for(int i = 0 ; i<all; i++ ){
    		list[i] = rand.nextInt(100);
    	}

        System.out.println("orden original: " + Arrays.toString(list));
        insertionSort(list);
        System.out.println("ordenado: " + Arrays.toString(list));
    }

	public static void insertionSort(int[] arr) {
      int i, j, newValue;
      for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                  arr[j] = arr[j - 1];
                  j--;
            }
            arr[j] = newValue;
      }
}
 }
