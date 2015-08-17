
import java.util.ArrayList;
import java.util.Scanner;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
public class Application {

   public static boolean isInArray(int[] array, int searchingFor) {
       for (int value : array) {
           if (value == searchingFor) {
               return true;
           }
       }
       return false;
   }
   
   public static boolean isWordInArray(String[] array, String searchingFor) {
       for (String word : array) {
           if (word.equals(searchingFor)) {
               return true;
           }
       }
       return false;
   }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(arr.length);
        System.out.println((0+1)/2);
    }
}
