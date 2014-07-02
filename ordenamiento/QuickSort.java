import java.util.*;
public class QuickSort{

  public static void main (String[] args){ 

    int all= 50;
      
    int[] list = new int[all];

    Random rand = new Random();
    for(int i = 0 ; i<all; i++ ){
      list[i] = rand.nextInt(100);
    }
    System.out.println("orden original: " + Arrays.toString(list));
    Quicksort(list, 0, all - 1); 
    System.out.println("ordenado:  " + Arrays.toString(list));
  } 

  static void Quicksort(int arr[], int p, int r){ 

    if(p < r) { 
      int q = Particion(arr, p, r); 
      Quicksort(arr, p, q - 1); 
      Quicksort(arr, q + 1, r); 
    } 
  } 

  static int Particion(int arr[], int p, int r){ 
    int x = arr[r]; 
    int i = p - 1, t; 

    for(int j = p; j < r; j++) { 
      if(arr[j] <= x) { 
        i++; 
        t = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = t; 
      } 
    } 

    t = arr[i + 1]; 
    arr[i + 1] = arr[r]; 
    arr[r] = t; 
    return i + 1; 
  } 
}