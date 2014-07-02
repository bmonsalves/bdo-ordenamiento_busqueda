import java.util.Random;
public class BubbleSort 
{
	public static void main(String []args)
	{
		int all= 50;
		
		int[] array = new int[all];
		Random rand = new Random();
  		for(int i = 0 ; i<all; i++ ){
			array[i] = rand.nextInt(100);
		}
		    
		String output = "orden original\n";
		    

		for(int counter=0; counter<array.length; counter++ )
			output += " " + array[ counter ];
		     
		bubbleSort( array );  // sort array
		    
		output += "\n\nordenado\n";
		    
		for (int counter=0; counter<array.length; counter++ ) 
			output += " " + array[ counter ];
		    
		System.out.println( output );
    
	} 
    
              
	public static void bubbleSort( int array2[] )                    
	{                                                         
                    
		for(int pass = 1; pass < array2.length; pass++ ) {   
          
			for ( int element = 0; element < array2.length - 1; element++ ) {

				if ( array2[ element ] > array2[ element + 1 ] ) 
					swap( array2, element, element + 1 );         
			}               
		}                       
	}                            

                     
	public static void swap( int array3[], int first, int second )
	{                                                      
		int hold;       
		
		hold = array3[ first ];                             
		array3[ first ] = array3[ second ];                 
		array3[ second ] = hold;                            
	}                                                      
} 
