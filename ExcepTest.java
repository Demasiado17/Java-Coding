// File Name : ExcepTest.java
import java.io.*;

public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2]; // Size 2
         System.out.println("Access element three :" + a[3]); // Accessing 3rd element
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");

      
      //Trying expection with finally block included  
      int a[] = new int[2]; // Size 2
      try {
        System.out.println("Access element three :" + a[3]); // Accessing 3rd element
     } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception thrown  :" + e);
     }finally { // Always executed no matter what!
        a[0] = 6;
        System.out.println("First element value: " + a[0]);
        System.out.println("The finally statement is executed");
     }


   }
}
