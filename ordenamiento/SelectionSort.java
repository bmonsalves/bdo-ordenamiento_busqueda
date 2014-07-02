import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {

        int all= 1000;
    		
    	int[] list = new int[all];
    	Random rand = new Random();
      	for(int i = 0 ; i<all; i++ ){
    		list[i] = rand.nextInt(100);
    	}

        System.out.println("orden original: " + Arrays.toString(list));
        selectionSort(list);
        System.out.println("ordenado: " + Arrays.toString(list));
    }

    public static void selectionSort(int[] x) {

	    for (int i=0; i<x.length-1; i++) {
	        int minIndex = i;      // indice de valor restante más pequeño.
	        for (int j=i+1; j<x.length; j++) {
	            if (x[minIndex] > x[j]) {
	                minIndex = j;  // guardar indice del nuevo mínimo
	            }
	        }
	        if (minIndex != i) { 
	            int temp = x[i];
	            x[i] = x[minIndex];
	            x[minIndex] = temp;
	        }
	    }
	}
 }
