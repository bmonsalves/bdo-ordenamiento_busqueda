class BusquedaSecuencial{
  
  public static void main(String []args){
    int result;
    int[] vector ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
    int valorBuscado = 68;

    System.out.print("array: ");
    for (int i = 0;i<vector.length; i++ ) {
      System.out.print(vector[i]+" ");
    }

    System.out.println("\nvalor buscado: "+ valorBuscado);

    result = busquedaSecuencial(vector,valorBuscado);
    if (result != -1) {
      System.out.println("posicion donde se encuentra: " + result);
    }else{
      System.out.println("valor no se encuentra en el array");
    }
  }

 public static int busquedaSecuencial(int []arreglo,int dato){
 int posicion = -1;
  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
        posicion = i;//Si es verdadero guardamos la posicion
        break;//Para el ciclo
      }
 }
 return posicion;
}


}