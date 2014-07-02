class BusquedaBinaria{
  
  public static void main(String []args){
    int result;
    int[] vector ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
    int valorBuscado = 68;

    System.out.print("array: ");
    for (int i = 0;i<vector.length; i++ ) {
      System.out.print(vector[i]+" ");
    }

    System.out.println("\nvalor buscado: "+ valorBuscado);

    result = busquedaBinaria(vector,valorBuscado);
    if (result != -1) {
      System.out.println("posicion donde se encuentra: " + result);
    }else{
      System.out.println("valor no se encuentra en el array");
    }
  }

 public static int busquedaBinaria(int  vector[], int dato){
  int n = vector.length;
  int centro,inf=0,sup=n-1;
   while(inf<=sup){
     centro=(sup+inf)/2;
     if(vector[centro]==dato) return centro;
     else if(dato < vector [centro] ){
        sup=centro-1;
     }
     else {
       inf=centro+1;
     }
   }
   return -1;
 }


}