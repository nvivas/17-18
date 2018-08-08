import java.util.Arrays;

public class ArrayDemo {
   public static void main(String[] args) {

      // initializing unsorted int array
      int iArr[] = {2, 1, 9, 6, 4};

      // let us print all the elements available in list
      for (int number : iArr) {
         System.out.println("Number = " + number);
      }

      // sorting array

      Arrays.sort(iArr);

      // let us print all the elements available in list
      System.out.println("The sorted int array is:");
      for (int number : iArr) {
         System.out.println("Number = " + number);
      }
   }
}

/*
 * Arrays.copyOf(vector,....)
 * Arrays.toString(vector)
 * Arrays.fill(vector,valor)		// rellenar
 * Arrays.sort(vector) Comparator 
 * Arrays.binarySearch(vector,valor)	// devuelve la posici�n en el vector de valor	
 *  
 */