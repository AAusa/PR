package prueba;

import java.util.Arrays;

public class Ej {
 
    public static void main(String[] args) {
 

    	int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      	Arrays.sort(x);
    	System.out.println(Arrays.binarySearch(x, x.length-1)); 
    }
}