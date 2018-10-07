import java.util.Scanner;
import java.util.ArrayList;

class StatsChallenge {
  public static void main(String[] args) {
    Scanner statScanner = new Scanner(System.in);
    ArrayList<Double> nums = new ArrayList<>();
    
    double number = -1;
    double sum = 0;
    
    //Prompt the user to enter numbers until he/she enters zero.
    while (number != 0) { 
      System.out.println("Enter a number:");
      number = statScanner.nextDouble();
      nums.add(number);
      nums.sort(Double::compareTo);
      sum += number;
    }
    
    double previous = 0;
    int count = 0;
    double mode = 0;
    int maxCount = 0;
    nums.removeIf((Double d) -> d == 0.0);
    
    for (Double num : nums) {
      if (num > previous) {
        if (count > maxCount) {
          mode = previous;
          maxCount = count;
      }
      count = 0;
      } else {
      }
         previous = num;
         count++;
      }
    
    //Print out the 2nd smallest, 2nd largest, average, and most common number.
    double secondSmallestNumber = nums.get(1);
    System.out.println("The second smallest number is " + secondSmallestNumber + ".");
    
    //Print the second largest number.
    nums.removeIf((Double d) -> d == 0.0);
    int secondLargestNumber = nums.size() - 2;
    System.out.println("The second largest number is " + nums.get(secondLargestNumber) + ".");
    
    //Print out the average number.
    System.out.println("The average number is " + sum / nums.size() + ".");
    
    //Print out the most common number.

    System.out.println("The most common number is " + mode + ".");
      
  }
}