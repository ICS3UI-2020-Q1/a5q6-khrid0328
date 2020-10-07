import java.util.Scanner;
/**
 * This program prints a box of stars depends on the users input
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");    

    // create a variable for user input
    int number = input.nextInt();

    // use a for loop to draw a line of *
    for (int count =1; count <= number; count++){
    
      // use a for loop to draw a line of *
      for(int i = 1; i <= number; i++){

        // loop action: print *
        System.out.print("* ");
    
      }

      // create a blank line
      System.out.println("");
    }
  }
}
