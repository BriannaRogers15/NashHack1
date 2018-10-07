import java.util.Scanner;

class LeapYear {
  public static void main(String[] args) {
    Scanner leapScanner = new Scanner(System.in);
    
    //Prompt the user to enter a year.
    System.out.println("Enter a year:");
    int newYear = leapScanner.nextInt();
    
    //Print out if the year is a leap year or not.
    if (newYear % 4 == 0 || newYear % 400 == 0) {
      System.out.println("This is a leap year.");
    } else {
      System.out.println("This is not a leap year.");
    }
  }
}